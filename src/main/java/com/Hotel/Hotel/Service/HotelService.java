package com.Hotel.Hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Hotel.Hotel.Core.Hotel;
import com.Hotel.Hotel.Port.HotelPort;
import com.Hotel.Hotel.Uses.HotelUses;

public class HotelService implements HotelUses{

	@Autowired
	HotelPort port;
	@Override
	public Optional<Hotel> getOneHotel(Integer id) {
		return port.getOneHotel(id);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return port.getAllHotels();
	}

}
