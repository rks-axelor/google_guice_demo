package com.gradledemo;

import com.google.inject.Inject;

public class SquareRequest {
	
	DrawShape d;
	@Inject // injecting through constructor
	SquareRequest( DrawShape d){
		this.d = d;
	}
	
	public void makeequest() {
		d.draw();
	}

}
