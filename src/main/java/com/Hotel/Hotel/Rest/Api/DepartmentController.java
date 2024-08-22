package com.Hotel.Hotel.Rest.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Annotations.CommonResponses;
import com.Hotel.Hotel.Annotations.DepartmentsAnnotation;
import com.Hotel.Hotel.Dto.DepartmentDto;
import com.Hotel.Hotel.Mappers.DepartmentsMappers;
import com.Hotel.Hotel.Rest.Response.DepartmentsResponse;
import com.Hotel.Hotel.Service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/Hotel")
public class DepartmentController {
	@Autowired
	DepartmentsMappers mapper;
	
	@Autowired
	DepartmentService service;
	@Operation
	(
			summary="Get All Departments",
			description="Get all departments currently present in the system"
	)
	@CommonResponses
	@DepartmentsAnnotation
	@GetMapping("/Department")
	public DepartmentsResponse getAllDepartments()
	{
		return DepartmentsResponse.builder()
				.dept(mapper.domainstoDto(service.getAllDepartments())).build();
	}
	
	@GetMapping("/Department/{id}")
	public ResponseEntity<DepartmentDto> getOneDepartment(@PathVariable String id)
	{
		return ResponseEntity.ok(
				mapper.domaintoDto(service.getOneDepartment(Integer.valueOf(id)).get()));
	}
}
