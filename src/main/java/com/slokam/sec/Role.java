package com.slokam.sec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
}
