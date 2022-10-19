package com.study.springboot.CircularReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coder {
	//아래 코드를 코멘트 제거하면, 순환참조가 발생합니다.
    /*
	@Autowired
	private Cheif cheif;
	
	public void code() {
		cheif.cook();
	}
	*/
}
