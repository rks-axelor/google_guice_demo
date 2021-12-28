package com.gradledemo;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(DrawShape.class).annotatedWith(Names.named("open")).to(DrawSmallSquare.class);
		bind(DrawShape.class).to(DrawSquare.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(30);
		
		System.err.println("hello");
		
	}

}
