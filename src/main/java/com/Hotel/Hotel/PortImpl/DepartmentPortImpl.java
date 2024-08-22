package com.Hotel.Hotel.PortImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Hotel.Hotel.Core.Department;
import com.Hotel.Hotel.Mappers.DepartmentsMappers;
import com.Hotel.Hotel.Port.DepartmentPort;
import com.Hotel.Hotel.Repository.DepartmentRepository;
@Component
public class DepartmentPortImpl implements DepartmentPort{
	@Autowired
	DepartmentRepository repository;
	
	@Autowired
	DepartmentsMappers mappers;
	
	@Override
	public Optional<Department> getOneDepartment(Integer id) {
		var Department = repository.findById(id);
		return Department.map(Departmententity->mappers.entitytoDomain(Departmententity));
	}

	@Override
	public List<Department> getAllDepartments() {
		
		return mappers.entitiestoDomain(StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList()));
	}

}
