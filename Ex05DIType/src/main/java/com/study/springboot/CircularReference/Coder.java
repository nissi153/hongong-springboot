package com.study.springboot.CircularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {
	@Autowired
	private Cheif cheif;
	
	public void code() {
		cheif.cook();
	}
}
