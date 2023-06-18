package com.code16.springjavaedu.fifthweek.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	//optimistic  lock
	@Version
	private Long version;

	@UpdateTimestamp
	@Column(name = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@CreationTimestamp
	@Column(name = "CREATE_DATE")
	private Date createDate;
}
