import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println();
    System.out.println( "Type the word \"weasel\", please." );
    word = keyboard.next();
//    yep = "weasel".equals(word);
    yep = word.equals("weasel");
    nope = ! word.equals("weasel");

    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );
    System.out.println();

    // Drill worked with weasel in front of .equals. That actually surprised me.
  }
}
