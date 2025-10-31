package com.example.fantasmas.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "users", description = "User entity for the Escape Room game")
public class users {

    @Schema(description = "User unique identifier (MongoDB ObjectId as string)",
            example = "672a1c9f8f2e4a1b0c123456")
    private String id;

    @Schema(description = "User display name", example = "Ramón")
    private String name;

    // getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}



@Document(collection = "users")
public class users {
    @Id
    String name;
    String decision;
    public users(String name, String decision) {
        this.name = name;
        this.decision = decision;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDecision() {
        return decision;
    }
    public void setDecision(String decision) {
        this.decision = decision;
    }

    
    

}
