package com.example.fantasmas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.fantasmas.documents.clues;

public interface cluesRepository extends  MongoRepository<clues, String>{

}
