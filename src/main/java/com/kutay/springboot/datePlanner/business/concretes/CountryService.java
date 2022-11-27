package com.kutay.springboot.datePlanner.business.concretes;

import com.kutay.springboot.core.utily.results.DataResult;
import com.kutay.springboot.core.utily.results.Result;
import com.kutay.springboot.core.utily.results.SuccessDataResult;
import com.kutay.springboot.core.utily.results.SuccessResult;
import com.kutay.springboot.datePlanner.business.abstracts.ICountryService;
import com.kutay.springboot.datePlanner.dataAccess.abstracts.ICountryDaoService;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryDaoService countryDaoService;

    @Override
    public Result saveCountry(Country country) {
        countryDaoService.save(country);
        return new SuccessResult("Kayıt Başarılı");
    }

    @Override
    public DataResult<List<Country>> getAllCountry() {
        return new SuccessDataResult<List<Country>>(countryDaoService.findAll(), "Ülkeler Listelendi");
    }


}
