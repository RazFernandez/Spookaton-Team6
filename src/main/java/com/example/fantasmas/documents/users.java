package com.example.fantasmas.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
