package com.mms.empgest.demo.repositories;

import com.mms.empgest.demo.domain.Occupation;
import org.springframework.data.repository.CrudRepository;

public interface OccupationRepositories extends CrudRepository<Occupation,Integer> {
}
