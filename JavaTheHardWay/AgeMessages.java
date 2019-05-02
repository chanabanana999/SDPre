import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.println();
    System.out.print( "How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account");
    }
    if ( age >= 13 ) {
      System.out.println( "\told enough to create a Facebook account");
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if ( age >= 16 ) {
      System.out.println( "\told enough to get a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tatoo" );
    }
    if ( age >= 18 ) {
      System.out.println( "\told enough to get a tatoo" );
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\told enough to drink alcohol" );
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
      System.out.println( "\t\t(How sad!)" );
    }
    if ( age >= 35 ) {
      System.out.println( "\told enough to run for President of the U.S." );
      }
    if ( age < 65 ) {
        System.out.println( "\tYou are not old enough to retire." );
      }
    // Drill #2 below
    if ( age >= 65 ) {
      System.out.println( "\tYou are old enough to retire!" );
    }
    System.out.println();

    /*
    Drill #1
    If you type in something over 35, it just says "You are:". We don't have a
    condition defined for that, so nothing happens. It just ends

    Drill #2 and #3 embedded above
    */
  }
}
