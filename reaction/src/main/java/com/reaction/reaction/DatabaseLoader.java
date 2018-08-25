package com.reaction.reaction;

import com.reaction.reaction.entity.Employee;
import com.reaction.reaction.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by muhammad.nizar01 on 8/22/2018.
 */
@Component
public class DatabaseLoader implements CommandLineRunner{


    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.employeeRepository.save(new Employee("Muhammad","Nizar","Technopreneur"));
        this.employeeRepository.save(new Employee("Kimmy","Tiara","Balerina"));
        this.employeeRepository.save(new Employee("Mugseda","Ralfiana","Business Woman"));
        this.employeeRepository.save(new Employee("Mamah","","IRT"));
        this.employeeRepository.save(new Employee("xxx","","xxx"));
    }
}
