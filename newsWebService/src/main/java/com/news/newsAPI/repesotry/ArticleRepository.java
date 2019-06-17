package com.news.newsAPI.repesotry;

import org.springframework.data.repository.CrudRepository;

import com.news.newsAPI.entity.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
