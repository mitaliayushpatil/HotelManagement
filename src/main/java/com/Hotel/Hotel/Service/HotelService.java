package com.Hotel.Hotel.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hotel.Hotel.Core.Hotel;
import com.Hotel.Hotel.PortImpl.HotelPortImpl;
import com.Hotel.Hotel.Uses.HotelUses;
@Service
public class HotelService implements HotelUses{
	
	@Autowired
	private HotelPortImpl port;
	
	@Override
	public Optional<Hotel> getOneHotel(Integer id) {
		return port.getOneHotel(id);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return port.getAllHotels();
	}

}
