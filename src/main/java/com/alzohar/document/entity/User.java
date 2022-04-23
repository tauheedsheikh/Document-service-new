package com.alzohar.document.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ecom_user")
public class User {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	
	@Column(name = "gmail")
	private String gmail;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "adress")
	private String adress;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "photo")
	@Lob
	private byte[] photo;
	
	@Column(name = "createdat")
	private Date createdAt= new Date();
	
	
	
}
