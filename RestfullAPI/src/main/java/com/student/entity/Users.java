package com.student.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Product")
public class Users implements Serializable{
	@Id
	String username;
	String password;
	String roles;
}
