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




@Document(collection = "rooms")
public class rooms {

    @Id
    String id;
    String room;
    int keysToOpen;
    String status;

    
    public rooms(String id, String room, int keysToOpen) {
        this.id = id;
        this.room = room;
        this.keysToOpen = keysToOpen;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public int getKeysToOpen() {
        return keysToOpen;
    }
    public void setKeysToOpen(int keysToOpen) {
        this.keysToOpen = keysToOpen;
    }

}
