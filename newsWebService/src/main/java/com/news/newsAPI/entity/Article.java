package com.news.newsAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Article implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int  id_article ; 
	private String url  ; 
	private String title ; 
	private String date_pub ; 
	private String contant ;
	
	
	@ManyToOne
	@JoinColumn(name="id_author" ,nullable= false    )
	private Author  author ; 
	
	
	@OneToOne
    @JoinColumn(name = "id_image")
	private Images  image ;


	@ManyToOne
	@JoinColumn(name="id_source" ,nullable= false  )
	private Source source ; 
	
	
	
	public int getId_article() {
		return id_article;
	}
	public void setId_article(int id_article) {
		this.id_article = id_article;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate_pub() {
		return date_pub;
	}
	public void setDate_pub(String date_pub) {
		this.date_pub = date_pub;
	}
	public String getContant() {
		return contant;
	}
	public void setContant(String contant) {
		this.contant = contant;
	}
	public Images getImage() {
		return image;
	}
	public void setImage(Images image) {
		this.image = image;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	
	
	
	
	
	
	
	
	
	

}
