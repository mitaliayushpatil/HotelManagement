package com.Hotel.Hotel.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Hotel.Hotel.Entities.HotelDetails;

@Repository
public interface HotelRepository extends CrudRepository<HotelDetails, Integer>{

}
