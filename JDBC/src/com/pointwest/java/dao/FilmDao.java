package com.pointwest.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.pointwest.java.beans.FilmBeans;

public class FilmDao {
	public int ctr;
	
	//Logger logger  = new Logger.getLogger(FilmDao.class);
	
	
	public List<FilmBeans> getFilms() {
		List<FilmBeans> films = null;
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/sakila";
			String user = "newuser";
			String password = "password123";
			String query = "Select * from sakila.film";
			
			try {
				
				Connection conn = DriverManager.getConnection(db,user,password);
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(query);
				
//				Statement st = conn.createStatement();
				PreparedStatement ps = conn.prepareStatement(query);
				
//				ResultSet rs1 = ps.executeQuery();
				
				
				films = new ArrayList<FilmBeans>();
				while(rs.next()) {
					FilmBeans film = new FilmBeans();
					film.setDescription(rs.getString("description"));
					film.setTitle(rs.getString("title"));
					film.setLength(rs.getString("length"));
					films.add(film);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
/*				logger.error("Connection Error Encountered.");
				logger.error(e.getMessage());*/
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("DAFUQ YOU DOIN??");
			e.printStackTrace();
		/*	logger.error(e.getMessage());*/
		}
		return films;

	}
	
	public List<FilmBeans> getFilmTitle() {
		List<FilmBeans> films = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/sakila";
			String user = "newuser";
			String password = "password123";
			String query = "SELECT * FROM SAKILA.FILM WHERE FILM.TITLE = 'ZOOLANDER FICTION';";
			
			try {
				
				Connection conn = DriverManager.getConnection(db,user,password);
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(query);
				
				films = new ArrayList<FilmBeans>();
				while(rs.next()) {
					FilmBeans film = new FilmBeans();
					film.setDescription(rs.getString("description"));
					film.setTitle(rs.getString("title"));
					film.setLength(rs.getString("length"));
					films.add(film);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
/*				logger.error("Connection Error Encountered.");
				logger.error(e.getMessage());*/
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("DAFUQ YOU DOIN??");
			e.printStackTrace();
		/*	logger.error(e.getMessage());*/
		}
		return films;

	}
	
	public List<FilmBeans> getFilmTitleTHE() {
		List<FilmBeans> films = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/sakila";
			String user = "newuser";
			String password = "password123";
			String query = "SELECT * FROM SAKILA.FILM WHERE FILM.TITLE LIKE ?;";
			String query1 = "SELECT * FROM SAKILA.FILM WHERE FILM.LENGTH>? AND FILM.LENGTH<?";
			//"SELECT * FROM SAKILA.FILM WHERE FILM.TITLE LIKE \"%THE%\";";
			
			try {
				
				Connection conn = DriverManager.getConnection(db,user,password);
				Statement statement = conn.createStatement();
				
				
				PreparedStatement ps = conn.prepareStatement(query1);
				//ps.setString(1, "%the%");
				ps.setInt(1, 100);
				ps.setInt(2, 150);
				ResultSet rs = ps.executeQuery();
				
				films = new ArrayList<FilmBeans>();
				while(rs.next()) {
					FilmBeans film = new FilmBeans();
					film.setDescription(rs.getString("description"));
					film.setTitle(rs.getString("title"));
					film.setLength(rs.getString("length"));
					films.add(film);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
/*				logger.error("Connection Error Encountered.");
				logger.error(e.getMessage());*/
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("DAFUQ YOU DOIN??");
			e.printStackTrace();
		/*	logger.error(e.getMessage());*/
		}
		return films;

	}

}
