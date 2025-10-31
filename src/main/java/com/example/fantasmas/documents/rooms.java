package com.example.fantasmas.documents;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
public class rooms {

    @Id
    String id;
    String room;
    int keysToOpen;

    
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
