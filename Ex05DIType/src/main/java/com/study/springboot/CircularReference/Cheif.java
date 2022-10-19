package com.study.springboot.CircularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cheif {
   @Autowired
   private Coder coder;
   
   public void cook() {
	   coder.code();
   }
}
