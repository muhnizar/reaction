package com.nizar.developer.coolweb.repository;

import com.nizar.developer.coolweb.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by muhammad.nizar01 on 8/4/2018.
 */
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepository  extends JpaRepository<Car, Long> {

}
