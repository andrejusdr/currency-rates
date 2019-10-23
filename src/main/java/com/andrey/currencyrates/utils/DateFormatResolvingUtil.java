package com.andrey.currencyrates.utils;

import com.andrey.currencyrates.exception.DateFormatException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class DateFormatResolvingUtil {

    private static final Map<String, String> DATE_FORMATS = new HashMap<String, String>() {
        {
            put("^\\d{8}$", "yyyyMMdd");
            put("^\\d{1,2}-\\d{1,2}-\\d{4}$", "dd-MM-yyyy");
            put("^\\d{4}-\\d{1,2}-\\d{1,2}$", "yyyy-MM-dd");
            put("^\\d{1,2}/\\d{1,2}/\\d{4}$", "MM/dd/yyyy");
            put("^\\d{4}/\\d{1,2}/\\d{1,2}$", "yyyy/MM/dd");
            put("^\\d{1,2}\\s[a-z]{3}\\s\\d{4}$", "dd MMM yyyy");
            put("^\\d{1,2}\\s[a-z]{4,}\\s\\d{4}$", "dd MMMM yyyy");
        }};

    public static LocalDate getLocalDateFromString(final String dateValue) {
        return LocalDate.parse(dateValue, getDateFormat(dateValue));
    }

    private static DateTimeFormatter getDateFormat(final String dateString) {
        for (final String regexp : DATE_FORMATS.keySet()) {
            if (dateString.toLowerCase().matches(regexp)) {

                return DateTimeFormatter.ofPattern(DATE_FORMATS.get(regexp));
            }
        }
        throw new DateFormatException("Given date format doesn't match any date pattern. One of possible date formats is yyyy-MM-dd");
    }
}
