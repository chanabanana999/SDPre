import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", guess;

    System.out.println();
    System.out.print( "What's the secret word? " );
    guess = keyboard.next();

    // Drill adds OR test
    if (guess.equals(secret) || guess.equals("Amazon") ) {
      System.out.println( "That's correct!" );
    }
    else {
      System.out.println( "No, the secret word isn't \"" + guess + "\"." );
    }
    if (guess == secret) {
      System.out.println( "(This will never ever show no matter what.)" );
    }
    System.out.println();
  }
}
