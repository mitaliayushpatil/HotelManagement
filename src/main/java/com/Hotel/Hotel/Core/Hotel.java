package com.Hotel.Hotel.Core;

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
public class Hotel {
	private int id;
	private String name;
	private String addline1;
	private String addline2;
	private int pincode;
	private String branchcode;

}
