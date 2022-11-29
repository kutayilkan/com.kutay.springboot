package com.kutay.springboot.datePlanner.business.concretes;

import com.kutay.springboot.datePlanner.business.abstracts.IActivityService;
import com.kutay.springboot.datePlanner.dataAccess.abstracts.IActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService implements IActivityService{

    private IActivityRepository activityRepository;

    @Autowired
    public ActivityService(IActivityRepository activityRepository) {
        this.activitiyRepository = activityRepository;
    }

}
