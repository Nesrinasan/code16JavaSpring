package com.code16.springjavaedu.sixthweek.saturday.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
public class ProductOrder extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productId")
	@BatchSize(size = 10)
	@ToString.Exclude private Product product;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orderId")
	@ToString.Exclude private Orders orders;


}
