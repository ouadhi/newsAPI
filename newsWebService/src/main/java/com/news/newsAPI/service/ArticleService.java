package com.news.newsAPI.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.newsAPI.entity.Article;
import com.news.newsAPI.repesotry.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired  
	private  ArticleRepository  articleRepository  ; 
	
	@PersistenceContext  
	private  EntityManager entityManager  ; 
	
	
	public List<Article>  getallArticles() {
		List<Article>  articles  = new  ArrayList() ; 
		articleRepository.findAll()
		.forEach(articles::add);
		
		System.out.println("liste Size  :  "+articles.size());
		
		return  articles  ; 
	}
	
	public  long  sizeAricles ()  {
		return articleRepository.count()  ; 
	}
	
	public Article findById( int  id)  {
		Article  article = articleRepository.findById(id).get()  ;
		return article ; 
		
	}

}
