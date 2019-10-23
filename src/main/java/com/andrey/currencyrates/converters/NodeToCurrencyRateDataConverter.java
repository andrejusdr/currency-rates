package com.andrey.currencyrates.converters;

import com.andrey.currencyrates.data.CurrencyRateData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Component
public class NodeToCurrencyRateDataConverter implements Converter<Node, CurrencyRateData> {

    private final static String DATE = "date";
    private final static String CURRENCY = "currency";
    private final static String QUANTITY = "quantity";
    private final static String RATE = "rate";
    private final static String UNIT = "unit";

    @Override
    public CurrencyRateData convert(@NotNull final Node node) {
        final CurrencyRateData currencyRateData = new CurrencyRateData();
        currencyRateData.setDate(getNodeValueByTagName(node, DATE));
        currencyRateData.setCurrency(getNodeValueByTagName(node, CURRENCY));
        currencyRateData.setQuantity(getNodeValueByTagName(node, QUANTITY));
        currencyRateData.setRate(BigDecimal.valueOf(Double.parseDouble(getNodeValueByTagName(node, RATE))));
        currencyRateData.setUnit(getNodeValueByTagName(node, UNIT));
        return currencyRateData;
    }

    private String getNodeValueByTagName(final Node node, final String tagName) {
        final Element element = (Element) node;
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
}
