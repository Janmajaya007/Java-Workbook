package com.factory_pattern.factory_implement;

import com.factory_pattern.factories.*;

public class FactoryImpl {
	public static Factory getFactory(String name) {
		if(name.equalsIgnoreCase("audi"))
			return new AudiFactory();
		if(name.equalsIgnoreCase("mercedes"))
			return new MercedesFactory();
		return null;
	}
}