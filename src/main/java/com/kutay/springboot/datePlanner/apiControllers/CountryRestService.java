package com.kutay.springboot.datePlanner.apiControllers;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.datePlanner.business.abstracts.ICountryService;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/api/datePlanner/country")
public class CountryRestService {

    @Autowired
    private ICountryService countryService;

    // Country

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveCountry(@Valid @RequestBody Country country) {
        return ResponseEntity.ok(countryService.saveCountry(country));
    }

    @PostMapping(value="/update")
    public ResponseEntity<?> updateCountry(@Valid @RequestBody Country country) {
        return ResponseEntity.ok(countryService.saveCountry(country));
    }


    @GetMapping(value = "/getAll")
    public ResponseEntity<?> getAllCountry() {
        return ResponseEntity.ok(countryService.getAllCountry());
    }

    @GetMapping(value="/getById")
    public ResponseEntity<?> getByCountryId(Integer countryId){
        ResponseEntity<DataResult<Country>> response = ResponseEntity.ok(countryService.getByCountryId(countryId));
        return response;
    }

}