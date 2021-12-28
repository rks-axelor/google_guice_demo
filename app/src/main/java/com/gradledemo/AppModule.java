package com.gradledemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;


public class AppModule extends AbstractModule {
	@Override
	protected void configure() {
		//bind(DrawShape.class).annotatedWith(Names.named("open")).to(DrawSmallSquare.class);
		//bind(DrawShape.class).to(DrawSquare.class);
	    
	}
	@Provides
    public DrawShape ProvideDrawShape() {
    	String color ="Red";
    	int edge = 20;
    	DrawShape d1 = new DrawSmallSquare(color,edge);
    	return d1;
    }

}
