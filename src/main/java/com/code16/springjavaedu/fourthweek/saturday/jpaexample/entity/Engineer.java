package com.code16.springjavaedu.fourthweek.saturday.jpaexample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ENGINEER")
@Data
public class Engineer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column
    private String tckn;

}
