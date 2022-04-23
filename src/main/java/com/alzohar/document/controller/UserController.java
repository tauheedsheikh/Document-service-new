package com.alzohar.document.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alzohar.document.entity.User;
import com.alzohar.document.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepo;

	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") long id) {
		Optional<User> user = userRepo.findById(id);
		if (user != null) {

		}
		return user;

	}

	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> list = userRepo.findAll();
		if (list.isEmpty()) {
		}
		return list;
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);

	}

	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userRepo.save(user);

	}

	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") long id) {
		userRepo.deleteById(id);

		return "User Delete Succesfully ";

	}
}
