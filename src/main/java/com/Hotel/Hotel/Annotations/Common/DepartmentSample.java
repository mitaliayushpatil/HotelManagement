package com.Hotel.Hotel.Annotations.Common;

import com.Hotel.Hotel.Rest.Response.DepartmentResponse;

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
public class DepartmentSample {

	private DepartmentResponse result;
}
