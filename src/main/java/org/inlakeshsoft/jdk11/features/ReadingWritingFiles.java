package org.inlakeshsoft.jdk11.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadingWritingFiles {

	public void writingAndReading() {
		try {
			Path path = Files.writeString(Path.of("\testing.txt"), "This is my file content", StandardOpenOption.CREATE_NEW);
			System.out.println(path);
			
			String content = Files.readString(path);
			System.out.println(content);
			
			Files.delete(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ReadingWritingFiles readingWritingFiles = new ReadingWritingFiles();
		readingWritingFiles.writingAndReading();
	}
	
}
