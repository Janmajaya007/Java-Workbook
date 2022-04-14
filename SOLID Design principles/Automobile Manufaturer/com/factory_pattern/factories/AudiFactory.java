package com.factory_pattern.factories;

import com.factory_pattern.parts.*;
import com.factory_pattern.parts.headlights.AudiHeadlight;
import com.factory_pattern.parts.tires.AudiTire;

public class AudiFactory implements Factory{
	@Override
	public Tire makeTire() {
		return new AudiTire();
	}
	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}
	@Override
	public String toString() {
		return "\tCar Details\t\n Tire Model Name : "+this.makeTire().getName()+"\n Headlight Model Name : "+this.makeHeadlight().getModelDetails();
	}
}
