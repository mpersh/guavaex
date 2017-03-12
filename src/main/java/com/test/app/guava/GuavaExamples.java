package com.test.app.guava;

import com.test.app.guava.basic.BasicUtilitiesExample;
import com.test.app.guava.collections.CollectionsExample;
import com.test.app.guava.io.IOExamples;
import com.test.app.guava.math.MathExamples;
import com.test.app.guava.primitives.PrimitivesExample;
import com.test.app.guava.strings.StringsExample;

public class GuavaExamples {
	public static void main(String[] args) {
		BasicUtilitiesExample basicUtilitiesExample = new BasicUtilitiesExample();
		basicUtilitiesExample.show();
		
		CollectionsExample collectionsExample = new CollectionsExample();
		collectionsExample.show();
		
		StringsExample stringsExample = new StringsExample();
		stringsExample.show();
		
		PrimitivesExample primitivesExample = new PrimitivesExample();
		primitivesExample.show();
		
		MathExamples mathExample = new MathExamples();
		mathExample.show();
		
		IOExamples ioExamples = new IOExamples();
		ioExamples.show();
	}
}
