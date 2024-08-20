package com.Hotel.Hotel.Mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.Hotel.Hotel.Core.Hotel;
import com.Hotel.Hotel.Dto.HotelDto;
import com.Hotel.Hotel.Entities.HotelDetails;
@Component
public class HotelMappers {
	public Hotel entitytoDomain(HotelDetails entity)
	{
		return new Hotel().builder()
				.id(entity.getId())
				.name(entity.getName())
				.addline1(entity.getAddline1())
				.addline2(entity.getAddline2())
				.branchcode(entity.getBranchcode())
				.pincode(entity.getPincode())
				.build();
	}
	public List<Hotel> entitiestoDomain( List<HotelDetails>entities)
	{
		return entities.stream().map(this::entitytoDomain).collect(Collectors.toList());			
	}
	public HotelDetails domaintoEntity(Hotel domain)
	{
		return new HotelDetails().builder()
				.id(domain.getId())
				.name(domain.getName())
				.addline1(domain.getAddline1())
				.addline2(domain.getAddline2())
				.pincode(domain.getPincode())
				.branchcode(domain.getBranchcode())
				.build();
	}
	public List<HotelDetails> domainstoEntity( List<Hotel>domains)
	{
		return domains.stream().map(this::domaintoEntity).collect(Collectors.toList());			
	}
	public HotelDto domaintoDto(Hotel domain)
	{
		return new HotelDto().builder()
				.id(domain.getId())
				.name(domain.getName())
				.addline1(domain.getAddline1())
				.addline2(domain.getAddline2())
				.pincode(domain.getPincode())
				.branchcode(domain.getBranchcode())
				.build();
	}
	public List<HotelDto> domainstoDto( List<Hotel>domains)
	{
		return domains.stream().map(this::domaintoDto).collect(Collectors.toList());			
	}
	public Hotel dtotoDomain(HotelDto dto)
	{
		return new Hotel().builder()
				.id(dto.getId())
				.name(dto.getName())
				.addline1(dto.getAddline1())
				.addline2(dto.getAddline2())
				.pincode(dto.getPincode())
				.branchcode(dto.getBranchcode())
				.build();
	}
	public List<Hotel> dtotoDomain( List<HotelDto>dtos)
	{
		return dtos.stream().map(this::dtotoDomain).collect(Collectors.toList());			
	}
	public HotelDetails dtotoEntity(HotelDto dto)
	{
		return new HotelDetails().builder()
				.id(dto.getId())
				.name(dto.getName())
				.addline1(dto.getAddline1())
				.addline2(dto.getAddline2())
				.pincode(dto.getPincode())
				.branchcode(dto.getBranchcode())
				.build();
	}
	public List<HotelDetails> dtostoEntity( List<HotelDto>dtos)
	{
		return dtos.stream().map(this::dtotoEntity).collect(Collectors.toList());			
	}
	public HotelDto entitytoDto(HotelDetails entity)
	{
		return new HotelDto().builder()
				.id(entity.getId())
				.name(entity.getName())
				.addline1(entity.getAddline1())
				.addline2(entity.getAddline2())
				.pincode(entity.getPincode())
				.branchcode(entity.getBranchcode())
				.build();
	}
	public List<HotelDto> entitiestoDto( List<HotelDetails>entities)
	{
		return entities.stream().map(this::entitytoDto).collect(Collectors.toList());			
	}
}
