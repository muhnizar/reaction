package com.reaction.reaction.repository;

import com.reaction.reaction.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by muhammad.nizar01 on 8/22/2018.
 */
@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
