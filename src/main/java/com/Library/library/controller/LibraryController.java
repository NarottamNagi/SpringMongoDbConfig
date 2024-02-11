package com.Library.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Library.library.Entity.LibraryEntity;
import com.Library.library.Repo.LibraryRepo;


@RestController
public class LibraryController {
	
	
	
	@Autowired
	com.Library.library.Repo.LibraryRepo libraryRepo;
	
	
	
	
	@GetMapping("/hello")
	public String getName()
	{
		return "hello Spring";
		
	}
	
	@PostMapping("/SaveUser")
	public ResponseEntity<LibraryEntity> saveUsr(@RequestBody LibraryEntity entity)
	{
		LibraryEntity l =libraryRepo.save(entity);
		if(l!=null)
		return new ResponseEntity(l,HttpStatus.OK);
		
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/delete/{id}")
	public void DeleteBookData(@PathVariable int id)
	{
		libraryRepo.deleteById(id);
	}

	@GetMapping("/findByBookName/{bookname}")
	public List<LibraryEntity> findBookName(@PathVariable String bookname )
	{
	
		return libraryRepo.findByBookName(bookname);
	
	}
	
}
