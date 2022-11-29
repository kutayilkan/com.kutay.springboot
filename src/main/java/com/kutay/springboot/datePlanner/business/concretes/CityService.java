package com.kutay.springboot.datePlanner.business.concretes;

import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.datePlanner.business.abstracts.ICityService;
import com.kutay.springboot.datePlanner.dataAccess.abstracts.ICityRepository;
import com.kutay.springboot.datePlanner.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    private ICityRepository cityRepository;

    @Autowired
    public CityService(ICityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public Result saveCity(City city) {
        return null;
    }
}
