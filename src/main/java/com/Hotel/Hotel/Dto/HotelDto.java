package com.Hotel.Hotel.Dto;

import com.Hotel.Hotel.Core.Hotel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
	private int id;
	private String name;
	private String addline1;
	private String addline2;
	private int pincode;
	private String branchcode;
}
