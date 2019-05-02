import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, color;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println();
    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + "." );
    System.out.println();

    System.out.println( "What is your favorite color, " + name + "?");
    color = keyboard.next();
    System.out.print( "You said " + color + "? No, that's wrong. " );
    System.out.println( "Better luck next time. Toodles!" );
    System.out.println();

    /* Drill #1: no, the program does not blow up if I enter an integer instead of
    a double. My best guess is that a double variable can accept an integer input
    and be just fine (but not vice versa - integer type requires whole numbers).

    Drill #2: no, it does not blow up. The string type accepts numbers, but it
    treats them as characters, not as numbers with a numerical value.

    Drill #3: the program will accept any input for #1, except control characters.
    All input is treated as a string.
    #2 needs to be an integer, because that's what's declared. A decimal or string
    makes this blow up.
    #3 Weight can be an integer or decimal value, not a string (because of type double)
    #4 same input type as #3.

    Dril #4 Added last block. */
  }
}
