package com.pointwest.java.main;

import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.log4j.Logger;


import com.pointwest.java.dao.FilmDao;
import com.pointwest.java.ui.FilmUI;

public class Main {
	
	
	public static void main(String[] args) {
		FilmDao filmdao = new FilmDao();
		filmdao.getFilms();
		System.out.println("\t");
		System.out.println(filmdao.ctr);
		
		FilmUI filmUI = new FilmUI();
		//filmUI.printFilm();
		
		filmUI.printFilmTitleTHE();
		
		//filmUI.printFilmTitle();
		

	}

}
