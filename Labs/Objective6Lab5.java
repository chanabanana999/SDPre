import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int selection = 1;
    String response = "";

    System.out.println();

    while ( selection != 3 ) {
      System.out.println( "________Menu________");
      System.out.println( "1: Say Hello" );
      System.out.println( "2: List my favorite foods" );
      System.out.println( "3: Exit" );
      System.out.println();

      selection  = keyboard.nextInt();

      if ( (selection < 1) || (selection >3 ) ) {
        response = "";
        System.out.println( "Please select 1, 2 or 3");
      }
      else {
        switch(selection) {
          case 1 :  response = "Hello, Human";
                    break;
          case 2 :  response = "Apples, Bananas, Coconuts";
                    break;
          case 3 :  response = "Goodbye";
                    break;
        }
      }
      System.out.println( response );
      System.out.println();
    }
    keyboard.close();
    System.out.println();

  }
}
