package com.kutay.springboot.datePlanner.dataAccess.abstracts;

import com.kutay.springboot.datePlanner.entities.concretes.Activity;
import com.kutay.springboot.datePlanner.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City, Integer> {
}
