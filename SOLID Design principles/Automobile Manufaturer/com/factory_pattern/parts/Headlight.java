package com.factory_pattern.parts;

public abstract class Headlight {
	private String model;
	protected Headlight(String model){
		super();
		this.model = model;
	}
	public String getModelDetails() {
		return this.model;
	}
}
