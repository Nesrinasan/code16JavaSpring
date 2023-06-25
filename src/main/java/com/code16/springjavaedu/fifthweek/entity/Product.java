package com.code16.springjavaedu.fifthweek.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Product extends BaseEntity {

	@Column
	private String name;


}
