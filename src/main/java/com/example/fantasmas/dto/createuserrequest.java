package com.example.fantasmas.documents.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "CreateUserRequest", description = "Payload to create a new user")
public class CreateUserRequest {

    @Schema(description = "Name to register for the user",
            example = "Rafael")
    private String name;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
