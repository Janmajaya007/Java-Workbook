package com.factory_pattern.factories;

import com.factory_pattern.parts.*;
import com.factory_pattern.parts.headlights.MercedesHeadlight;
import com.factory_pattern.parts.tires.MercedesTire;

public class MercedesFactory implements Factory{
	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}
	
	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}
	@Override
	public String toString() {
		return "\tCar Details\t\n Tire Model Name : "+this.makeTire().getName()+"\n Headlight Model Name : "+this.makeHeadlight().getModelDetails();
	}
}
