package com.bootcamp.demo.factorydesign;

public class FactoryPatternDemo {

	// Our demo class will use ShapeFactory to get a Shape object.
	// It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get
	// the type of object it needs.

	public static void main(String[] args) {

		ShapeFactory shapeFactory = ShapeFactory.instance();

		shapeFactory.getShape(ShapeType.CIRCLE).draw();
		shapeFactory.getShape(ShapeType.SQUARE).draw();
		shapeFactory.getShape(ShapeType.RECTANGLE).draw();

	}

}
