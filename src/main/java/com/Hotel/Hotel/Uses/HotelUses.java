package com.Hotel.Hotel.Uses;

import java.util.List;
import java.util.Optional;

import com.Hotel.Hotel.Core.Hotel;

public interface HotelUses {
	public Optional<Hotel> getOneHotel(Integer id);
	public List<Hotel> getAllHotels();
}
