package com.gradledemo;

import com.google.inject.Inject;

public class DrawSmallSquare extends DrawSquare implements DrawShape  {
	private String color;
	private Integer edge;
	@Inject
	public DrawSmallSquare(@ColorValue String color,@EdgeValue Integer edge) {
		super();
		this.color = color;
		this.edge = edge;
	}

	@Override
	public void draw() {
		System.out.println("drawing small square of color :" +color+ " and with edge :" +edge);
		
	}

}
