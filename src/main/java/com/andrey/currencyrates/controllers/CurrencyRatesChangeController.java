package com.andrey.currencyrates.controllers;

import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.facades.CurrencyRatesChangeFacade;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/currencyrates")
public class CurrencyRatesChangeController {

    private final CurrencyRatesChangeFacade currencyRatesChangeFacade;

    @Autowired
    public CurrencyRatesChangeController(final CurrencyRatesChangeFacade currencyRatesChangeFacade) {
        this.currencyRatesChangeFacade = currencyRatesChangeFacade;
    }

    @GetMapping("/changes/{date}")
    @ApiOperation(value = "Get currency rate change by date", notes = "Endpoint to retrieve the currency rate change calculated by given date and one day before")
    @ApiResponses({@ApiResponse(code = 200, message = "Returns List of CurrencyRateChangeData objects sorted by biggest rate change", response = CurrencyRateChangeData.class) })
    public ResponseEntity<List<CurrencyRateChangeData>> getCurrencyChangeByDate(@PathVariable final String date) {
            return ResponseEntity.ok(currencyRatesChangeFacade.getCurrencyRatesChangeByDate(date));
    }
}