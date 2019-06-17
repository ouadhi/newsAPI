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
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_author  ; 
	private String nom ; 
	private String post  ;
	
	@OneToMany(mappedBy = "author"  , fetch = FetchType.LAZY  , cascade = CascadeType.ALL )
	@JsonIgnore
	private  List<Article> articles  ;  
	
	public int getId_author() {
		return id_author;
	}
	public void setId_author(int id_author) {
		this.id_author = id_author;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
	
	
	
	
	
	
	

}
