package com.example.fantasmas.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.fantasmas.documents.users;
public interface usersRepository extends   MongoRepository<users, String>{

}
