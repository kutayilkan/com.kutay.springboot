package com.kutay.springboot.datePlanner.dataAccess.abstracts;

import com.kutay.springboot.datePlanner.entities.concretes.Activity;
import com.kutay.springboot.datePlanner.entities.concretes.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegionRepository extends JpaRepository<Region, Integer> {
}
