package com.example.fantasmas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.fantasmas.UI.ScapeRoomGame;

@SpringBootApplication
public class FantasmasApplication {

	public static void main(String[] args) {
		SpringApplication.run(FantasmasApplication.class, args);
		ScapeRoomGame game = new ScapeRoomGame();
		game.startGame();
	}

}
