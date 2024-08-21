package com.Hotel.Hotel.Annotations.Common;

import com.Hotel.Hotel.Rest.Response.HotelResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HotelsResponseSample {

	HotelResponse result;
}
