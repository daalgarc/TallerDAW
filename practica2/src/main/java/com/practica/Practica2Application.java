package com.practica;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica.entidades.User;
import com.practica.repositorios.UserRepository;

@SpringBootApplication
public class Practica2Application {
	@Autowired
	private UserRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(Practica2Application.class, args);
	}
	
	
	
}
