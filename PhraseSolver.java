/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */

  /* your code here - constructor(s) */ 
  

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      // TODO: game logic
      // you'll need a nested 'while' loop, while this player's guess is correct

        // inside, print the current board
        // set the letter value
        // prompt the current player for a guess
        // check to see if the game is solved
        // check to see if the letter is in the phrase

      
      // outside the inner loop, switch players     

      solved = true; // <<< this will not be here anymore
      
    } // close while(!solved)

    // outside the outer loop, print the players names and scores
   
  } // close play() method
  
}