package com.scottrbrtsn.boiler.spring.plate.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logs")
@Data
public class Logs {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column
    private long id;

}
