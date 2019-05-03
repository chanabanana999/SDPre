import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String answer;

    // Drill in block below
    System.out.println();
    System.out.println( "Are you ready?!?");
    System.out.println( "(You have to type YES! in order to proceed.)" );
    answer = keyboard.next();

    while ( ! answer.equals("YES!") ) {
      System.out.println();
      System.out.println( "Let's try this again...ARE YOU READY?!?");
      System.out.println( "(Seriously, just type YES! so we can move on.)" );
      answer = keyboard.next();
    }
    // End of drill.

    System.out.println();
    System.out.print( "Give me a number, and I'll find its square root. " );
    System.out.print( "(No negatives, please.) ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println( "I won't take the square root of a negative." );
      System.out.print( "\nNew number: " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println( "The square root of "+x+" is "+y);
    System.out.println();
  }
}
