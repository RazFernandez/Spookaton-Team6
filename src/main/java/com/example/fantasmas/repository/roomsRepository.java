package com.example.fantasmas.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.fantasmas.documents.rooms;

public interface roomsRepository extends MongoRepository<rooms, String> {

}
