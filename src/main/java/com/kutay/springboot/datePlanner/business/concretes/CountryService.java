package com.kutay.springboot.datePlanner.business.concretes;

import com.kutay.springboot.core.utily.results.*;
import com.kutay.springboot.datePlanner.business.abstracts.ICountryService;
import com.kutay.springboot.datePlanner.dataAccess.abstracts.ICountryDaoService;
import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {

    private ICountryDaoService countryDaoService;

    @Autowired
    public CountryService(ICountryDaoService countryDaoService) {
        this.countryDaoService = countryDaoService;
    }

    @Override
    public Result saveCountry(Country country) {
        countryDaoService.save(country);
        return new SuccessResult("Kayıt Başarılı");
    }

    @Override
    public DataResult<List<Country>> getAllCountry() {
        return new SuccessDataResult<>(countryDaoService.findAll(), "Ülkeler Listelendi");
    }

    @Override
    public DataResult<Country> getByCountryId(Integer countryId) {
        return new SuccessDataResult<>(countryDaoService.findById(countryId).get());
    }
}
