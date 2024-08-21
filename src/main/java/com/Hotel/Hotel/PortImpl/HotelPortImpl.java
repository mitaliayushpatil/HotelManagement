package com.Hotel.Hotel.PortImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Hotel.Hotel.Core.Hotel;
import com.Hotel.Hotel.Mappers.HotelMappers;
import com.Hotel.Hotel.Port.HotelPort;
import com.Hotel.Hotel.Repository.HotelRepository;
@Component
public class HotelPortImpl implements HotelPort{

	@Autowired
	HotelRepository repository;
	
	@Autowired
	HotelMappers mappers;
	
	@Override
	public Optional<Hotel> getOneHotel(Integer id) {
		var hotel = repository.findById(id);
		return hotel.map(hotelentity->mappers.entitytoDomain(hotelentity));
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return mappers.entitiestoDomain(StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList()));
	}

}
