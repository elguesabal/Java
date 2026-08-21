package com.java.Project_1.service;

import org.springframework.stereotype.Service;

@Service
public class VampetaService {
	public String vampeta(String string) {
		return ("Vampeta " + string);
	}
}