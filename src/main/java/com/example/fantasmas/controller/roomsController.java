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

import com.example.fantasmas.documents.rooms;
import com.example.fantasmas.repository.roomsRepository;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping("/rooms")

public class roomsController {

    @Autowired
    private roomsRepository usRepo;

    @PostMapping("/room")
    public ResponseEntity<?> saveUsuario(@RequestBody rooms users){
        try{
            rooms usuarioSave = usRepo.save(users);
            return new ResponseEntity<rooms>(usuarioSave, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllUsuarios(){
        try{
            List<rooms>allUsuarios = usRepo.findAll();
            return new ResponseEntity<List<rooms>>(allUsuarios,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
