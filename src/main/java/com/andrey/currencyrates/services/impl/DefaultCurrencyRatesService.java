package com.andrey.currencyrates.services.impl;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.andrey.currencyrates.services.CurrencyRatesService;

import lt.lb.webservices.ExchangeRates.ExchangeRates;
import lt.lb.webservices.ExchangeRates.ExchangeRatesLocator;
import lt.lb.webservices.ExchangeRates.ExchangeRatesSoap;
import lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult;

@Service
public class DefaultCurrencyRatesService implements CurrencyRatesService {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultCurrencyRatesService.class);

    private final static String ITEM = "item";

    @Override
    public NodeList getExchangeRatesByDate(final String date) {
        final ExchangeRatesSoap exchangeRatesSoap = getExchangeRatesSoap();
        if (exchangeRatesSoap != null) {
            try {
                final GetExchangeRatesByDateResponseGetExchangeRatesByDateResult result = exchangeRatesSoap.getExchangeRatesByDate(date);
                final MessageElement messageElement = result.get_any()[0];
                return getNodeList(messageElement);

            } catch (final RemoteException e) {
                LOG.error("getExchangeRatesByDate execute failed " + e.getMessage());
            }
        }
        return null;
    }

    private NodeList getNodeList(final MessageElement messageElement)
    {
        try {
            final Document document = messageElement.getAsDocument();
            document.normalize();
            return document.getElementsByTagName(ITEM);
        } catch (final Exception e) {
            LOG.error("Unable to get NodeList from MessageElement " + e.getMessage());
        }
        return null;
    }

    private ExchangeRatesSoap getExchangeRatesSoap() {
        try {
            final ExchangeRates exchangeRates = new ExchangeRatesLocator();
            return exchangeRates.getExchangeRatesSoap();
        } catch (final ServiceException e) {
            LOG.error("getExchangeRatesSoap execute failed " + e.getMessage());
        }
        return null;
    }
}