package com.kutay.springboot.datePlanner.business.abstracts;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.datePlanner.entities.concretes.Country;

import java.util.List;

public interface ICountryService {
    Result saveCountry(Country country);

    DataResult<List<Country>> getAllCountry();

    DataResult<Country> getByCountryId(Integer countryId);

}
