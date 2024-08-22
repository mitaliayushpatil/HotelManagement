package com.Hotel.Hotel.Uses;

import java.util.List;
import java.util.Optional;

import com.Hotel.Hotel.Core.Department;

public interface DepartmentUses {
	public Optional<Department> getOneDepartment(Integer id);
	public List<Department> getAllDepartments();
}
