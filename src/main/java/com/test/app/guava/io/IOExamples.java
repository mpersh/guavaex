package com.test.app.guava.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.io.CharSink;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;

public class IOExamples {
	
	public void show() {
		IOExamples ioExamples = new IOExamples();
		try {
			ioExamples.writeUsingFiles();
			ioExamples.readLinesExample();
			ioExamples.writeUsingCharSink();
			ioExamples.readUsingCharStreams();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void writeUsingFiles() throws IOException {
		String expectedValue = "Writes a character sequence (such as a string) to a file using the given character set.";
	    File file = new File("test.txt");
	    Files.write(expectedValue, file, Charsets.UTF_8);
	    String result = Files.toString(file, Charsets.UTF_8);
	    System.out.println(result);
	}
	
	private void writeUsingCharSink() throws IOException {
		List<String> names = Lists.newArrayList("Creates", "a", "mutable", "ArrayList", "instance");
	    File file = new File("test.txt");
	    CharSink sink = Files.asCharSink(file, Charsets.UTF_8);
	    sink.writeLines(names, " ");	 
	    String result = Files.toString(file, Charsets.UTF_8);
	    System.out.println(result);
	}
	
	private void readLinesExample() throws IOException {
		File file = new File("test.txt");
	    List<String> result = Files.readLines(file, Charsets.UTF_8);
	    System.out.println(result);
	}
	
	private void readUsingCharStreams() throws IOException {
	    FileReader reader = new FileReader("test.txt");
	    String result = CharStreams.toString(reader);
	    System.out.println(result);
	}

}
