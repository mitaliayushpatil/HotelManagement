package com.Hotel.Hotel.Port;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.Hotel.Hotel.Core.Department;
@Component
public interface DepartmentPort {
	public Optional<Department> getOneDepartment(Integer id);
	public List<Department> getAllDepartments();
}
