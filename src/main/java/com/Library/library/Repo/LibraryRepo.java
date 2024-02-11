package com.Library.library.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.Library.library.Entity.LibraryEntity;


@Repository
public interface LibraryRepo extends MongoRepository<com.Library.library.Entity.LibraryEntity, Integer> {

	
	@Query("{'bookName': ?0 }")
	 List<LibraryEntity> findByBookName(String bookname);

	

}
