package com.pointwest.java.manager;

import java.util.List;

import com.pointwest.java.beans.FilmBeans;
import com.pointwest.java.dao.FilmDao;

public class FilmManager {

	public List<FilmBeans> getFilm(){
		FilmDao filmDao = new FilmDao();
		List<FilmBeans> films = filmDao.getFilms();
		
		return films;
	}
	
	public List<FilmBeans> getFilmTitle(){
		FilmDao filmDao = new FilmDao();
		List<FilmBeans> films = filmDao.getFilmTitle();
		return films;
		
	}
	
	//getFilmTitleTHE()
	
	public List<FilmBeans> getFilmTitleTHE(){
		FilmDao filmDao = new FilmDao();
		List<FilmBeans> films = filmDao.getFilmTitleTHE();
		return films;
		
	}
}