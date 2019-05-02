import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.println();
    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second ) {
      System.out.println( first + " is LESS THAN " + second );
    }
    if ( first <= second ) {
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );
    }
    if ( first == second ) {
      System.out.println( first + " is EQUAL TO " + second );
    }
    if ( first >= second ) {
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );
    }
    if ( first > second ) {
      System.out.println( first + " is GREATER THAN " + second );
    }
    if ( first != second )
      System.out.println( first + " is NOT EQUAL TO " + second );
      // Drill 1
      System.out.println( "Hey." );
      // Here "Hey" prints no matter what because only the first statement
      // after "if" runs when the condition completes. Then execution resumes.

    // Drill 2
    if ( first != second ) {
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }
    // Here "Hey" will only print as part of the if block - so if the condition
    // does not apply, "Hey" does not print.

    System.out.println();
  }
}
