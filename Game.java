import java.util.Scanner;
public class Game{
     public static void main(String[] args){

    int numberGuess = 25;

    Scanner numberGame = new Scanner(System.in);
    System.out.print("Guess Number");
    int userGuess = numberGame.nextInt();
    
    if(numberGuess == userGuess)
   System.out.printf("Congrats %d%n", userGuess);
   
   if(numberGuess > userGuess)
   System.out.printf("too high %d%n", userGuess);

   if(numberGuess < userGuess)
   System.out.printf("too low %d%n", userGuess);


}



}