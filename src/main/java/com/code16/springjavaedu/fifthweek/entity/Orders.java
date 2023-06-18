package com.code16.springjavaedu.fifthweek.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Data, LAzy, eager konuları.
 */
@Entity
@Table
@Data
public class Orders extends BaseEntity {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pId")
	private Product product;

	@JoinColumn(name = "pp")
	private Long pIID;

}
