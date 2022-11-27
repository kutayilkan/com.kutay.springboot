package com.kutay.springboot.datePlanner.dataAccess.abstracts;

import com.kutay.springboot.datePlanner.entities.concretes.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryDaoService extends JpaRepository<Country, Integer> {
}
