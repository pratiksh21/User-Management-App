package com.geekster.assignment.UserManagement.Model;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private Integer userId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$")
    private String userName;

    private Type type;

    @Email(message = "Enter valid Email")
    private String userEmail;

    @Size(min = 12,max = 12)
    @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
    private  String userContactNo;

    @Pattern( regexp = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$")
    private String dob;


    private LocalDate date = LocalDate.now();


    private LocalTime  time =  LocalTime.now();

}
/*
    UserId
	Name
	UserName
	Address
	Phone Number
	*/
