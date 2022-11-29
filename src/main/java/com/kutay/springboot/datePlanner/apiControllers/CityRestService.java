package com.kutay.springboot.datePlanner.apiControllers;

import com.kutay.springboot.datePlanner.business.abstracts.ICityService;
import com.kutay.springboot.datePlanner.entities.concretes.City;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value="api/datePlanner/city")
public class CityRestService {

    @Autowired
    private ICityService cityService;

    @PostMapping(value = "/save")
    public ResponseEntity<?> savecity(@Valid @RequestBody City city) {
        return ResponseEntity.ok(cityService.saveCity(city));
    }
}
