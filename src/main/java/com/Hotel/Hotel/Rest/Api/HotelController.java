package com.Hotel.Hotel.Rest.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hotel.Hotel.Annotations.CommonResponses;
import com.Hotel.Hotel.Annotations.HotelsAnnotations;
import com.Hotel.Hotel.Mappers.HotelMappers;
import com.Hotel.Hotel.Rest.Response.HotelsResponse;
import com.Hotel.Hotel.Service.HotelService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

	@Autowired
	HotelMappers mapper;
	
	@Autowired
	HotelService service;
	@Operation
	(
			summary="Get All Hotels",
			description="Get all hotels currently present in the system"
	)
	@CommonResponses
	@HotelsAnnotations
	public HotelsResponse getAllHotels()
	{
		return HotelsResponse.builder()
				.Hotels(mapper.domainstoDto(service.getAllHotels())).build();
	}
}
