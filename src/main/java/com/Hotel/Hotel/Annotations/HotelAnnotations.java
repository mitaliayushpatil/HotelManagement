package com.Hotel.Hotel.Annotations;

import com.Hotel.Hotel.Annotations.Common.HotelResponseSample;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses
(  value= {@ApiResponse
		(
			responseCode="200",
			description="Successful Operation",
			content= {
					@Content
					(
							mediaType= "application/json",
							schema = @Schema(implementation = HotelResponseSample.class)
					)
			}
				
		)}
)
public @interface HotelAnnotations {

}
