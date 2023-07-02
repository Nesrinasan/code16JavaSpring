package com.code16.springjavaedu.sixthweek.saturday.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table
@Entity
@Getter
@Setter
public class Orders extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String orderNumber;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "productId")
//	@ToString.Exclude private Product product;

}
