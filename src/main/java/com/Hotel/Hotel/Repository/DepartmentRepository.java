package com.Hotel.Hotel.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.Entities.DepartmentDetails;
@Repository
public interface DepartmentRepository  extends CrudRepository<DepartmentDetails, Integer>{

}
