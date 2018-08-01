package com.practica.repositorios;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.practica.entidades.User;



public interface UserRepository extends MongoRepository<User, String> {
	User findBy_id(ObjectId _id);
	
	User findBynombre(String nombre);
	List<User> findByservicio(String servicio);

}
