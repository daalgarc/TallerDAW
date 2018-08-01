package com.practica.controllers;

import java.util.LinkedList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.entidades.User;
import com.practica.repositorios.UserRepository;

@Controller
public class HomeController {
	@Autowired
	UserRepository usuarios;
	
	
	@RequestMapping("/usuarios")
	public String usuarios(Model model) {
		
		
		List<User> users = (List<User>) usuarios.findByservicio("CLARO");
		List<User> users2 = (List<User>) usuarios.findByservicio("CNEL");
		List<User> users3 = new LinkedList<User>();
		users3.add(users.get(1));
		users3.add(users2.get(1));
		
		
		
	
		model.addAttribute("users",users3);
		
		
		return "usuarios";
	}
	
	@RequestMapping("/usuario")
	public String usuario(Model model) {
		System.out.println("hola");
		List<User> users= new LinkedList<User>();
		User user=usuarios.findBy_id(new ObjectId("5b58939682a2530bd45c837d"));
		if(user==null) {
			System.out.println("hola");
			
		}
		else {
			System.out.println("user");
			System.out.println(user.getNombre());
			users.add(user);
			for(User user1 : users) {
				System.out.println("mi nombre:"+user1.getNombre());	
			}
			
		}
		
		
	
		
		
		
		model.addAttribute("users",users);
		
		return "usuarios";
	}

}
