package com.Hotel.Hotel.Rest.Response;

import com.Hotel.Hotel.Dto.DepartmentDto;

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
public class DepartmentResponse {

	private DepartmentDto dept;
}
