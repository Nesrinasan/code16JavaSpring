package com.code16.springjavaedu.fifthweek.saturday.restcall.openfeign.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cId;

	@Column
	private String name;

	@Column
	private String phoneNumber;

	@Column
	private Boolean active;


}
