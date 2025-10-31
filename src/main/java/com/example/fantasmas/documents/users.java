package com.example.fantasmas.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class users {
    @Id
    String name;
    

}
