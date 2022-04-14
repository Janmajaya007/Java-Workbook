package com.factory_pattern.parts;

public abstract class Tire {
	private String name;
	protected Tire(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
