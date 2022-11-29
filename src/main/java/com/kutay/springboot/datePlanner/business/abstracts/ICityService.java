package com.kutay.springboot.datePlanner.business.abstracts;

import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.datePlanner.entities.concretes.City;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.stereotype.Service;

public interface ICityService {

    Result saveCity(City city);
}
