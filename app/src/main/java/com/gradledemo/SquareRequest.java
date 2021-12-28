package com.gradledemo;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SquareRequest {
	//@Inject // injecting through field
	DrawShape d;
	@Inject // injecting through constructor
	SquareRequest(@Named("open") DrawShape d){
		this.d = d;
	}
	//@Inject injecting through method
	
	/*public void setDrawShape(DrawShape d) {
		this.d= d;
	}*/
	public void makeequest() {
		d.draw();
	}

}
