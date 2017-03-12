package com.test.app.guava.basic;

public class BasicUtilitiesExample {

	public void show() {
		GuavaOptionalExample guavaOptionalExample = new GuavaOptionalExample();
		guavaOptionalExample.showOptional();
		
		GuavaPreconditionsExample guavaPreconditionsExample = new GuavaPreconditionsExample();
		guavaPreconditionsExample.showPreconditions();
		
		GuavaOrderingExample guavaOrderingExample = new GuavaOrderingExample();
		guavaOrderingExample.showOrdering();
		
		GuavaObjectsExample guavaObjectsExample = new GuavaObjectsExample();
		guavaObjectsExample.showObjects();
		
		GuavaThrowablesExample guavaThrowablesExample = new GuavaThrowablesExample();
		guavaThrowablesExample.showThrowables();
	}		

}
