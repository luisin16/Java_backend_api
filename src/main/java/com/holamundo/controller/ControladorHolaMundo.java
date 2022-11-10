package com.holamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHolaMundo {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h1>Hola Mundo desde Spring Boot</h1>";
	}
	@RequestMapping("/persona")
	public List <persona>getPersonas(){
		List<persona>personas=new ArrayList<persona>();
		persona p1= new persona();
		p1.setId(1);
		p1.setNombre("Juan");
		p1.setApellidos("Peres");
		p1.setTelefono("123456789");
		personas.add(p1);
		
		persona p2= new persona();
		p2.setId(2);
		p2.setNombre("Luis");
		p2.setApellidos("Martinez");
		p2.setTelefono("987654321");
		personas.add(p2);
		
		return personas;
	}
	
}
