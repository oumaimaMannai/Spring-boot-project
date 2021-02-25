package com.example.coupedemonde1.serviceimpl;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.coupedemonde1.Repository.FileRepository;
import com.example.coupedemonde1.entities.File;
import com.example.coupedemonde1.service.FileStorageService;


@Service
public class FileStorageServiceimpl implements FileStorageService{
	  @Autowired
	  private FileRepository fileRepository;

	  public File store(MultipartFile file) throws IOException {
		  String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		  File File = new File(fileName, file.getContentType(), file.getBytes());

		  return fileRepository.save(File);
	  }

	  public File getFile(String id) {
		  return fileRepository.findById(id).get();
	  }
	  
	  public Stream<File> getAllFiles() {
		  return fileRepository.findAll().stream();
	  }
}
