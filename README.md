# ReversiML (JAVA Reversi Game + Machine Learning Bot)

## Biography  
**Authors:**
Jordi Jaspers [[Github](https://github.com/Jordi-Jaspers "Github Page"), [Linkedin](https://www.linkedin.com/in/jordi-jaspers/ "Linkedin Page")] 
  
**Date of initial commit:** 
12/02/2020  

**Description:**
In this project I created a Reversi Game in a Java enironment and tried to use different AI-techniques to create a bot that could beat any player. The search algorithm is a minimax search with alpha-beta pruning in combination with heuristic functions. I am using 2 different evaluation methods to create the fastest and best solution possible. The first method is a real-time evaluation of the board status and the second method is Machine-Learning-Tuned Evaluation.

The AI may take its moves from a database of commonly played openings [(Database Gameplay](http://www.samsoft.org.uk/reversi/openings.html "(Source Code)")] 

## Documentation  
**Evaluation Methods:**

1. Realtime Evaluation : Evaluation function changes as you move from early-game to end-game with each move, using linear interpolation between static values.  
  
2. Machine-Learning-Tuned Evaluation : A Hill-Climbing algorithm to train weights on each heuristic function based on the game status.

**Heurestic functions:**
One of the most critical components of the search algorithm is the heuristic function, which evaluates the strength and overall desireability of a given board position. It is implemented as a linear combination of the following statistics, with the weights adapting as the game progresses

- Corner Grab (Measures if the current player can take a corner with its next move, Weighted highly at all times.)

- Stability (Measures the number of discs that cannot be flipped for the rest of the game. Weighted highly at all times.)

- Mobility (Measures the number of moves the player is currently able to make. Has significant weight in the opening game, but diminishes to zero weight towards the endgame.)

- Placment (piece placement score of the current player minus the piece placement score of the opponent.)

- Frontier Discs (number of spaces adjacent to opponent pieces minus the the number of spaces adjacent to the current player's pieces.)

- Disc difference (Measures the difference in the number of discs on the board. Has zero weight in the opening, but increases to a moderate weight in the midgame, and to a significant weight in the endgame.)

- Parity (Measures who is expected to make the last move of the game. Has zero weight in the opening, but increases to a very large weight in the midgame and endgame.) (currently unused feature)

## What We Learned
 * Machine Learning basics
 * New Algorithms
 * Heurestic functions
 * New Approach of finding solutions
* Connecting JAVA-game to a Laravel Website
 * ...
  
## TODO-List:  
-   Build the main application in JAVA 
-   Let the AI interact with the game
-   Use the different ML methods on the AI-bot
-   Finish the full AI-bot
-   aesthetics of the game
-   Connect the application to my website
-   ...

## Troubleshooting:   
-   Nothing yet...  

## References:  
 * POSTGREPL: <https://www.codementor.io/engineerapart/getting-started-with-postgresql-on-mac-osx-are8jcopb>
 * Python REST: <https://www.codementor.io/dongido/how-to-build-restful-apis-with-python-and-flask-fh5x7zjrx>
 * Python REST: <https://www.youtube.com/channel/UCK8YsKv4-N6ItZfzEyKlI6A>
 * microservices: <https://www.youtube.com/watch?v=PY9xSykods4>
 * REST vs SOAP: <https://www.youtube.com/watch?v=bPNfu0IZhoE>
 * REST API Examples: <https://www.youtube.com/watch?v=7YcW25PHnAA>
 * Docker vs Laravel: <https://laradock.io/documentation/>
 * Troubleshooting: <https://stackoverflow.com/>
 * Opening moves database: <http://www.samsoft.org.uk/reversi/openings.html>
 * Zobrit Hashing: <https://en.wikipedia.org/wiki/Zobrist_hashing>
 * Reversi game: <https://nl.wikipedia.org/wiki/Reversi>
 * ML inspiration: <https://github.com/arminkz/Reversi>
 * ...