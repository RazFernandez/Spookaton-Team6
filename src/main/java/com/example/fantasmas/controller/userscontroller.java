package com.example.fantasmas.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fantasmas.documents.users;
import com.example.fantasmas.repository.usersRepository;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/users")

public class userscontroller {
    @Autowired
    private usersRepository usRepo;

    @PostMapping("/name")
    public ResponseEntity<?> saveUsuario(@RequestBody users users){
        try{
            users usuarioSave = usRepo.save(users);
            return new ResponseEntity<users>(usuarioSave, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteUsuario(@PathVariable("id") String id){
        try{
            usRepo.deleteById(id); //Repositorio
            return new ResponseEntity<String>("Registro eliminado correctamente", HttpStatus.OK);
        } catch(Exception e){
                return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
