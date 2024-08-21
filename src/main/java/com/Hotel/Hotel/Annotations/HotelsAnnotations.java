package com.Hotel.Hotel.Annotations;

import com.Hotel.Hotel.Annotations.Common.HotelsResponseSample;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses(
		value={
			@ApiResponse(
					responseCode = "200",
					description= "Successful",
					content = {@Content
					(
							mediaType="application/json",
							schema = @Schema(implementation = HotelsResponseSample.class)
					)		
					}
					)
		})
public @interface HotelsAnnotations {

}
