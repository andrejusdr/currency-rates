package com.andrey.currencyrates;

import com.andrey.currencyrates.controllers.CurrencyRatesChangeController;
import com.andrey.currencyrates.converters.CurrencyRateToCurrencyRateChangeConverter;
import com.andrey.currencyrates.converters.NodeToCurrencyRateDataConverter;
import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.facades.impl.DefaultCurrencyRatesChangeFacade;
import com.andrey.currencyrates.services.CurrencyRatesService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.w3c.dom.NodeList;

import java.util.List;

import static com.andrey.currencyrates.utils.NodeListParserUtil.getNodeList;
import static org.mockito.Mockito.atLeastOnce;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@SpringBootTest
public class CurrencyRatesApplicationTests {

    private final static String DATE_ACTUAL = "2013-01-02";
    private final static String DATE_BEFORE = "2013-01-01";
    private final static String ACTUAL_XML_RESPONSE = "src/test/resources/getExchangeRatesByDate.xml";
    private final static String PREVIOUS_DAY_XML_RESPONSE = "src/test/resources/getExchangeRatesDayBefore.xml";

    @Mock
    private CurrencyRatesService service;

    private CurrencyRateToCurrencyRateChangeConverter currencyRateToCurrencyRateChangeConverter;
    private NodeToCurrencyRateDataConverter nodeToCurrencyRateDataConverter;
    private DefaultCurrencyRatesChangeFacade facade;
    private CurrencyRatesChangeController controller;

    private MockMvc mockMvc;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Mockito.reset(service);
        currencyRateToCurrencyRateChangeConverter = new CurrencyRateToCurrencyRateChangeConverter();
        nodeToCurrencyRateDataConverter = new NodeToCurrencyRateDataConverter();
        facade = new DefaultCurrencyRatesChangeFacade(service, nodeToCurrencyRateDataConverter,
                currencyRateToCurrencyRateChangeConverter);
        controller = new CurrencyRatesChangeController(facade);
        mockMvc = standaloneSetup(controller).build();
    }

    @Test
    public void shouldReturnCurrencyRatesChange() throws Exception {
        final NodeList actualDateNodeList = getNodeList(ACTUAL_XML_RESPONSE);
        final NodeList previousDayNodeList = getNodeList(PREVIOUS_DAY_XML_RESPONSE);

        Mockito.when(service.getExchangeRatesByDate(DATE_ACTUAL)).thenReturn(actualDateNodeList);
        Mockito.when(service.getExchangeRatesByDate(DATE_BEFORE)).thenReturn(previousDayNodeList);

        final MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/api/currencyrates/changes/{date}", DATE_ACTUAL)
                        .accept(MediaType.APPLICATION_JSON)).andReturn();

        Mockito.verify(service, atLeastOnce()).getExchangeRatesByDate(DATE_ACTUAL);
        Mockito.verify(service, atLeastOnce()).getExchangeRatesByDate(DATE_BEFORE);

        Assert.assertEquals("Status should be 200", 200, result.getResponse().getStatus());

        final ObjectMapper mapper = new ObjectMapper();
        final List<CurrencyRateChangeData> currencyRateChangeDataList = mapper
                .readValue(result.getResponse().getContentAsByteArray(),
                        new TypeReference<List<CurrencyRateChangeData>>() {
                        });

        Assert.assertEquals("currencyRateChangeDataList size should be 88", 88, currencyRateChangeDataList.size());
    }
}