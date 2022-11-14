package com.bootcamp.demo.wordconverter;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Number {
	
	@Getter
	@Setter
//	@AllArgsConstructor
//	@EqualsAndHashCode
//	@NoArgsConstructor
	private int num;

	public Number() {
		
	}
	
	public Number(int num) {
		this.num = num;
	}
	
	


}
