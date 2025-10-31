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

import com.example.fantasmas.documents.clues;
import com.example.fantasmas.repository.cluesRepository;

@CrossOrigin(origins = "http://localhost:8100")
    @RestController
    @RequestMapping("/clues")
public class cluesController {
    
    @Autowired
    private cluesRepository usRepo;

       @PostMapping("/clue")
    public ResponseEntity<?> saveUsuario(@RequestBody clues clues){
        try{
            clues usuarioSave = usRepo.save(clues);
            return new ResponseEntity<clues>(usuarioSave, HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/FoundClue")
    public ResponseEntity<?> getAllUsuarios(){
        try{
            List<clues>allUsuarios = usRepo.findAll();
            return new ResponseEntity<List<clues>>(allUsuarios,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
