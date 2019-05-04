import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection = 1;
    String response = "";

    while( selection != 3 ) {
      System.out.println();
      printMenu();
      selection = scanner.nextInt();

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
    scanner.close();
  }
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
