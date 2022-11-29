package com.kutay.springboot.datePlanner.dataAccess.abstracts;

import com.kutay.springboot.datePlanner.entities.concretes.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActivityRepository extends JpaRepository<Activity, Integer> {
}
