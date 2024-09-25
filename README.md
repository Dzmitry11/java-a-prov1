# Dice Game

Welcome to the Dice Game! This is a simple Java console-based game where two players roll a pair of dice to see who gets the highest score.

## Project Structure

The project consists of the following classes:

Players.java
This class represents a player in the game. It has the following attributes and methods:
playerName: The name of the player.
playerAge: The age of the player.
Constructors to initialize these attributes.
Getter and Setter methods to access and modify player details.
Prov1DiceGame.java
This is the main class that runs the game. It contains:
A method rollDice() that simulates rolling a single die, generating a random number between 1 and 6.
The main() method where the game logic is implemented. It:
Prompts two players to enter their names.
Rolls two dice for each player and calculates their total score.
Compares the scores to determine the winner or if it's a draw.
How to Play

## Setup:
Clone or download the project to your local machine.
Open the project in your preferred Java IDE or editor.
Running the Game:
Run the Prov1DiceGame.java file.
Enter the names for Player 1 and Player 2 when prompted.
The game will automatically roll two dice for each player and display their total scores.
The player with the highest total score wins. If both players have the same score, it's a draw.
Example Output

css
Copy code
Welcome to Dice Game!
Player1 input your name
John
Player2 input your name
Jane
Welcome to Dice game: John Jane
Player1 rolled: 5 and 3 (Total: 8)
Player2 rolled: 2 and 6 (Total: 8)
Nobody wins
Requirements

Java Development Kit (JDK) 8 or above.
A Java IDE or text editor to run and modify the code.
## Improvements

This game can be enhanced further with the following features:

Allow players to play multiple rounds and keep track of scores.
Add the ability for players to set their own ages.
Implement more complex rules for scoring.
Add a graphical user interface (GUI) for better user experience.
Contributing

If you have suggestions or improvements, feel free to open an issue or submit a pull request. Contributions are always welcome!

## License

This project is licensed under the MIT License - see the LICENSE file for details.

This README.md provides a clear overview of your project, instructions on how to play, and suggestions for further development. You can customize it as needed to better fit your project’s specifics.
