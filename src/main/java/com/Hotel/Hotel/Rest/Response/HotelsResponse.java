package com.Hotel.Hotel.Rest.Response;

import java.util.List;

import com.Hotel.Hotel.Dto.HotelDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelsResponse {

	List<HotelDto> Hotels;
}
