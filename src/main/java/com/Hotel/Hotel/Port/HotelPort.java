package com.Hotel.Hotel.Port;

import java.util.List;
import java.util.Optional;

import com.Hotel.Hotel.Core.Hotel;

public interface HotelPort {
	public Optional<Hotel> getOneHotel(Integer id);
	public List<Hotel> getAllHotels();
}
