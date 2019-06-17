package com.news.newsAPI.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.news.newsAPI.entity.Article;
import com.news.newsAPI.service.ArticleService;

@Controller
@RequestMapping("news")
public class ArticlController {
	
	@Autowired
	private  ArticleService  articleService  ;  
	
	@GetMapping("/")
	public ResponseEntity<String> startApplication () {
		return new ResponseEntity<String>("News API for Customs",HttpStatus.OK)  ; 
	}
	
	
	@GetMapping("articles")
	public ResponseEntity<List<Article>> getAllArtilces() {
		List<Article> list = articleService.getallArticles();
		return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
	}
	
	@GetMapping("articles/{id}") 
	public ResponseEntity<Article> getarticle(@PathVariable(name="id") Integer  id ) {
		Article article = null ; 
		article = articleService.findById(id)  ; 
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	
	@GetMapping("articles/count") 
	public ResponseEntity<Long> getcount( ) {
		 long count =   articleService.sizeAricles() ;  
		return new ResponseEntity<Long>(count, HttpStatus.OK);
	}
	
	

}
