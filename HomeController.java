package Advance.java.lecture3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Advance.java.lecture3.Beans.RequestBean;
import jakarta.websocket.server.PathParam;

@RestController
public class HomeController {
	
	
	@GetMapping("/api/details/{id}")
	public String getById(@PathVariable int id) {
		return "hello Id :" + id;
		
	}
	
	@GetMapping("/api/params")
	public String paramval(@PathParam("name") String name, @PathParam("age") int age){

		return "param values :: name" + name+" age :: "+ age;
	}
	
	
	//POST 
	
	
	@PostMapping("/apis/postApi")
	public String postApis(@RequestBody RequestBean Request) {

		return Request.toString();
		
	}

}
