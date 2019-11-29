package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileService {

	private static final String FILE_DIRECTORY = "uploads";

	public void storeFile(MultipartFile file) throws IOException {

		if (file.getSize() > 10485760) {
			throw new MaxUploadSizeExceededException(file.getSize());
		}

		Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
		System.out.println("File saved: " + file.getOriginalFilename());
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}
}