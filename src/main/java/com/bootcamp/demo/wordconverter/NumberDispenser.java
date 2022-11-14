package com.bootcamp.demo.wordconverter;

public interface NumberDispenser {

	void chain(NumberDispenser numberDispenser);
	void dispense(Number num);
	
}
