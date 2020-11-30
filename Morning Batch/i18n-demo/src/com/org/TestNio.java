package com.org;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestNio {

	public static void main(String[] args) throws Exception {
		DirectoryStream<Path> path = Files.newDirectoryStream(Paths.get("D://"));
		path.forEach(p -> System.out.println(p));
	}

}
