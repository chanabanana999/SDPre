import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println();

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0" );
    keyboard.nextDouble();

    System.out.println( "Is there anythign else you would like to say?" );
    keyboard.next();

    System.out.println();
    
    /* The second question blows up when I type a word instead of a number. */
    /* The third question also blows up when I type a word instead of a number
    because it's expecting a double, not a string. */

  }
}
