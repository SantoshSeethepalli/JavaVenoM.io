# JavaVenoM.io

## Overview

This is a simple implementation of the classic Snake Game built using Java. The game allows the player to control a snake that moves across the board, eating apples to grow in size. The objective is to eat as many apples as possible without colliding with the snake's own body or the walls. This project helped me to understand and work in a object based environment.

## Features
- Classic Snake Game mechanics
- Random apple generation
- Smooth snake movement
- Game-over detection when hitting the walls or the snake's own body

## How to Play
1. Use the arrow keys to control the snake's movement.
2. Eat apples to grow the snake.
3. Avoid hitting the walls or the snake's body.
4. The game ends if the snake collides with itself or the walls.

## How to Run
1. Clone the repository:
   ```
   git clone https://github.com/SatyaSantosh197/SnakeGame.git
   ```
2. Navigate to the project directory.
3. Compile the Java files using:
   ```
   javac SnakeGame.java
   ```
4. Run the game:
   ```
   java SnakeGame
   ```

## Dependencies
- Java Development Kit (JDK) 8 or higher

## Project Structure
- `SnakeGame.java`: Main class that handles the game loop and overall gameplay.
- `Board.java`: Handles the game grid, drawing the snake, and the apple.
- `Snake.java`: Represents the snake, its movement, and growth logic.
- `Apple.java`: Represents the apple that the snake eats
