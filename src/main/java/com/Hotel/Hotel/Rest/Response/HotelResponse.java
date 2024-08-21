package com.Hotel.Hotel.Rest.Response;

import com.Hotel.Hotel.Dto.HotelDto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelResponse {
	@NotNull
	private HotelDto hotel;
}
