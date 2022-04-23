package com.alzohar.document.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alzohar.document.entity.User;
import com.alzohar.document.repository.UserRepository;
import com.alzohar.document.service.FileStorageService;

@RestController
public class UserWithImage {

	@Autowired
	private FileStorageService fileStorageService;
	
	@Autowired
	private UserRepository repo;
	
	@PostMapping(value = "/upload/image")
	public User upload(@RequestBody User user, @RequestPart("file")MultipartFile file) {
		User saveUser=repo.save(user);
		if(saveUser!=null);
		try {
		fileStorageService.store(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}
	
}
