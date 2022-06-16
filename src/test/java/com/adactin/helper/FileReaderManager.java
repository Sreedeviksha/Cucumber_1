package com.adactin.helper;

import java.io.File;
import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
	}
	
	public static FileReaderManager getFrInstance() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	
	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}
