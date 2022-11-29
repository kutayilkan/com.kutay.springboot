package com.kutay.springboot.datePlanner.business.concretes;

import com.kutay.springboot.datePlanner.business.abstracts.IRegionService;
import com.kutay.springboot.datePlanner.dataAccess.abstracts.IRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService implements IRegionService {

    private IRegionRepository regionRepository;

    @Autowired
    public RegionService(IRegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

}
