# 🕸️ Haunted Server: Java REST API Escape Room

## 🎯 Overview

This project challenges each team to design an **interactive Java REST API** that simulates an **escape room experience**.  
Players interact with the haunted digital world through **HTTP requests**, solving clues and riddles to “escape” from a cursed server.

The challenge tests:
- 🧩 Backend logic & reasoning
- 🤝 Teamwork & collaboration
- ✍️ Creative storytelling through REST endpoints

---

## 🧠 Concept

Each team must create a **Java REST API** that behaves like a **digital escape room**.

Players begin **“trapped”** inside a haunted server and must solve a series of puzzles by sending the right HTTP requests to the corresponding endpoints.  
Each correct request reveals new narrative clues, riddles, or keys that allow progression to the next stage.

The goal: escape from the haunted server by collecting all keys and unlocking the final door.

---

## ⚙️ API Instructions

### 🧩 Example Flow

1. **GET `/room`**  
   → Returns the first clue and a brief room description.

2. **POST `/door`**  
   → Submits a **key** (via JSON body or query parameter) to unlock the next stage.

3. **GET `/hallway`**  
   → Returns a new clue and ambient description to move forward.

4. **POST `/escape`**  
   → Verifies if the user has collected all keys and escaped successfully.

---

## 🧾 Example JSON Response

```json
{
  "message": "The air turns cold... a faint click echoes in the dark.",
  "status": "door_unlocked"
}
```

---

## 🧱 Expected Structure

| Endpoint | Method | Description |
|-----------|---------|-------------|
| `/room` | GET | Returns the opening clue and sets the narrative context. |
| `/door` | POST | Receives a “key” and checks if it’s valid to unlock the next stage. |
| `/hallway` | GET | Provides a new riddle or clue to proceed. |
| `/escape` | POST | Final verification endpoint: confirms if the player escaped. |

---

## 💡 Tips for Development

- Implement each puzzle or riddle through **logic validation** on endpoints.
- Use **JSON-based storytelling**, combining narrative with gameplay.
- Design **clear status messages** like `door_locked`, `clue_revealed`, or `escaped_successfully`.
- Maintain **state tracking** (e.g., which keys the player has found).
- Optionally, add **extra challenges** (e.g., wrong key penalties, timed puzzles).

---

## 🧪 Example Testing Flow (Postman)

1. Send `GET /room` → read the narrative and get the first clue.
2. Use that clue to form the right key.
3. Send `POST /door` with the key → unlocks a new area.
4. Continue with `GET /hallway`.
5. Finish with `POST /escape` to verify if all steps were completed successfully.

---

## 🕯️ Narrative Element (Optional)

Include immersive text for each endpoint response, for example:

```json
{
  "message": "A candle flickers... revealing a code etched on the wall: 'XK-42'.",
  "hint": "You might need this later...",
  "status": "clue_revealed"
}
```

---

## 🧙‍♂️ Objective

By the end of this challenge, your API should:
- Run on a local or hosted Java environment.
- Contain at least **4 REST endpoints** with sequential puzzle logic.
- Return **JSON-formatted narrative feedback**.
- Demonstrate teamwork, creativity, and software design principles.
