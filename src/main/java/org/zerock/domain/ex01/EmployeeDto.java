package org.zerock.domain.ex01;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmployeeDto {
	private int id;
	private String firstName;
	private String lastName;
	private String photo;
	private String notes;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;

}
