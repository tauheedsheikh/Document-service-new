package com.alzohar.document.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pancard_service")
@Entity
public class File {

	 @Id
//	  @GeneratedValue(generator = "uuid")
//	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private String id;
	  private String name;
	  private String type;
	  @Lob
	  private byte[] data;

}
