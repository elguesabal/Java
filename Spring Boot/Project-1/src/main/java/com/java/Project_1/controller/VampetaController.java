package com.java.Project_1.controller;

import com.java.Project_1.service.VampetaService;
import com.java.Project_1.domain.User;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/vampeta")
public class VampetaController {
	@Autowired
	private VampetaService vampetaService;

	@GetMapping
	public String getVampeta() {
		return (this.vampetaService.vampeta("vampeta"));
	}

	@PostMapping("/vampeta/{id}")
	public String postVampeta(@PathVariable("id") String id, @RequestParam(value = "vampeta", defaultValue = "") String param, @RequestBody User body) {
		System.out.println("id: " + id);
		System.out.println("param: " + param);
		System.out.println("name: " + body.getName());
		return ("id: " + id + "\n" + "param: " + param + "\n" + "Name: " + body.getName() + "\n");
	}
}