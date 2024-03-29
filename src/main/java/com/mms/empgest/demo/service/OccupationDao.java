package com.mms.empgest.demo.service;

import com.mms.empgest.demo.domain.Occupation;
import com.mms.empgest.demo.repositories.OccupationRepositories;
import com.mms.empgest.demo.serviceimp.OccupationDaoImp;
import org.springframework.stereotype.Service;

@Service
public class OccupationDao  implements OccupationDaoImp {

    OccupationRepositories occupationrepositories;

    public OccupationDao(OccupationRepositories occupationrepositories) {
        this.occupationrepositories = occupationrepositories;
    }

    @Override
    public Occupation addOccupation(Occupation occupation) {

        occupationrepositories.save(occupation);
        return occupation;

    }
}
