package com.code16.springjavaedu.sixthweek.saturday.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
public class Product extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String name;

	@Column
	private Double price;

	@Column
	private String category;

	@Column
	private String photoUrl;


}
