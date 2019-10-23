package com.andrey.currencyrates.utils;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class NodeListParserUtil {

    private final static String ITEM = "item";

    public static NodeList getNodeList(final String response) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            final Document document = documentBuilder.parse(response);
            return document.getElementsByTagName(ITEM);
        } catch (final SAXException | IOException | ParserConfigurationException e) {
            return null;
        }
    }
}