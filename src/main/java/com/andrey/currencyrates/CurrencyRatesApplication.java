package com.andrey.currencyrates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CurrencyRatesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyRatesApplication.class, args);
    }

}
