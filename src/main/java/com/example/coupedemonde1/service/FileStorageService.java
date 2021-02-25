package com.example.coupedemonde1.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.coupedemonde1.entities.File;
import java.util.stream.Stream;

public interface FileStorageService {
	
	public File getFile(String id);
	
	public Stream<File> getAllFiles();
	
	public File store(MultipartFile file) throws IOException;
}
