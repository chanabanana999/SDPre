import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, enteredpwd;

    pin = 12345;

    System.out.println();
    System.out.println( "WELCOME TO THE BANK OF JAVA." );

    // Drill: ask and test for a password
    System.out.print( "ENTER YOUR PASSWORD: " );
    enteredpwd = keyboard.next();

    while ( ! enteredpwd.equals("sparky") ) {
      System.out.println( "\nINCORRECT PASSWORD. TRY AGAIN." );
      System.out.print( "ENTER YOUR PASSWORD: " );
      enteredpwd = keyboard.next();
    // End of Drill
    }
    System.out.print( "ENTER YOUR PIN: " );
    entry = keyboard.nextInt();

    while ( entry != pin) {
      System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
      System.out.print( "ENTER YOUR PIN: " );
      entry = keyboard.nextInt();
    }
    System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    System.out.println();
  }
}
