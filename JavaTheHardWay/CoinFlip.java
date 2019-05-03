import java.util.Scanner;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    System.out.println();

    do {
        gotHeads = Math.random() < 0.5;

        if ( gotHeads )
          coin = "HEADS";
        else
          coin = "TAILS";

        System.out.println();
        System.out.println( "You flip a coin and it is... " + coin );

        if ( gotHeads ) {
            streak ++;
            System.out.println("\tThat's " + streak );
            System.out.print( "Would you like to flip again (y/n)? ");
            again = keyboard.next();
        }
        else {
          System.out.println( "\tYou lose everything!" );
          System.out.println( "\tShould have quit while you were aHEAD...." );
          streak = 0;
          again = "n";
        }
    }   while ( again.equals("y") );
    System.out.println( "Final score: " + streak );
    System.out.println();
  }
}
