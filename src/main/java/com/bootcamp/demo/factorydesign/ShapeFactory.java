package com.bootcamp.demo.factorydesign;

public class ShapeFactory {

	private static ShapeFactory INSTANCE;

	private ShapeFactory() {

	}

	public static ShapeFactory instance() {
		if (INSTANCE == null) {
			INSTANCE = new ShapeFactory();
		}
		return INSTANCE;
	}

	public Shape getShape(ShapeType type) {

		Shape shape = null;

		switch (type) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;

	}

}
