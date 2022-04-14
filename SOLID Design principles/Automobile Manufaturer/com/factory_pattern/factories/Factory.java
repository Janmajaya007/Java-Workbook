package com.factory_pattern.factories;
import com.factory_pattern.parts.*;

public interface Factory {
	public Headlight makeHeadlight();
	public Tire makeTire();
}
