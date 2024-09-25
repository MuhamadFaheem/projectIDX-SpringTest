package com.example.demo.entity;


import com.example.demo.util.enums.Gender;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // This tells Hibernate to make a table out of this class
public class User {
	@Id
	@Column(nullable = false, name = "user_id")
	private String id;
	private String name;
	private String nik;
	private Integer umur;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING) // This will store the enum as a string in the database
    private Gender gender;
	private String birthDate;
	private String address;
	private String country;
}