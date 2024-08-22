package com.Hotel.Hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Core.Department;
import com.Hotel.Hotel.PortImpl.DepartmentPortImpl;
import com.Hotel.Hotel.Uses.DepartmentUses;
@Service
public class DepartmentService implements DepartmentUses{

	@Autowired
	private DepartmentPortImpl port;
	
	@Override
	public Optional<Department> getOneDepartment(Integer id) {
		return port.getOneDepartment(id);
	}

	@Override
	public List<Department> getAllDepartments() {
		return port.getAllDepartments();
	}

}
