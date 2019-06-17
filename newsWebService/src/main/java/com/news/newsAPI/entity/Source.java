package com.news.newsAPI.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Source {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id_source ;  
	private String name  ;
	

	@OneToMany(mappedBy = "source" , fetch = FetchType.LAZY  , cascade = CascadeType.ALL )
	@JsonIgnore
	private  List<Article> articles  ;  
	
	public int getId_source() {
		return id_source;
	}
	public void setId_source(int id_source) {
		this.id_source = id_source;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
