package com.Hotel.Hotel.Mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Hotel.Hotel.Core.Department;
import com.Hotel.Hotel.Dto.DepartmentDto;
import com.Hotel.Hotel.Entities.DepartmentDetails;
@Component
public class DepartmentsMappers {
	public Department entitytoDomain(DepartmentDetails entity)
	{
		return new Department().builder()
				.id(entity.getId())
				.name(entity.getName())
				.details(entity.getDetails())
				.build();
	}
	public List<Department> entitiestoDomain( List<DepartmentDetails>entities)
	{
		return entities.stream().map(this::entitytoDomain).collect(Collectors.toList());			
	}
	public DepartmentDetails domaintoEntity(Department domain)
	{
		return new DepartmentDetails().builder()
				.id(domain.getId())
				.name(domain.getName())
				.details(domain.getDetails())
				.build();
	}
	public List<DepartmentDetails> domainstoEntity( List<Department>domains)
	{
		return domains.stream().map(this::domaintoEntity).collect(Collectors.toList());			
	}
	public DepartmentDto domaintoDto(Department domain)
	{
		return new DepartmentDto().builder()
				.id(domain.getId())
				.name(domain.getName())
				.details(domain.getDetails())
				.build();
	}
	public List<DepartmentDto> domainstoDto( List<Department>domains)
	{
		return domains.stream().map(this::domaintoDto).collect(Collectors.toList());			
	}
	public Department dtotoDomain(DepartmentDto dto)
	{
		return new Department().builder()
				.id(dto.getId())
				.name(dto.getName())
				.details(dto.getDetails())
				.build();
	}
	public List<Department> dtotoDomain( List<DepartmentDto>dtos)
	{
		return dtos.stream().map(this::dtotoDomain).collect(Collectors.toList());			
	}
	public DepartmentDetails dtotoEntity(DepartmentDto dto)
	{
		return new DepartmentDetails().builder()
				.id(dto.getId())
				.name(dto.getName())
				.details(dto.getDetails())
				.build();
	}
	public List<DepartmentDetails> dtostoEntity( List<DepartmentDto>dtos)
	{
		return dtos.stream().map(this::dtotoEntity).collect(Collectors.toList());			
	}
	public DepartmentDto entitytoDto(DepartmentDetails entity)
	{
		return new DepartmentDto().builder()
				.id(entity.getId())
				.name(entity.getName())
				.details(entity.getDetails())
				.build();
	}
	public List<DepartmentDto> entitiestoDto( List<DepartmentDetails>entities)
	{
		return entities.stream().map(this::entitytoDto).collect(Collectors.toList());			
	}
}
