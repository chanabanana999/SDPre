import java.util.Scanner;

public class ThirtyDays {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int month, days;
    String monthName;

    System.out.println();
    System.out.print( "Which month? (1-12) " );
    month = keyboard.nextInt();

    switch(month) {
      case 1: monthName = "January";
              break;
      // Drill in commented statements
      // System.out.println ( monthName );
      case 2: monthName = "February";
              break;
      // System.out.println ( monthName );

      case 3: monthName = "March";
              break;
      // System.out.println ( monthName );
      case 4: monthName = "April";
              break;
      // System.out.println ( monthName );
      case 5: monthName = "May";
      //        break;
      // System.out.println ( monthName );
      case 6: monthName = "June";
              break;
      // System.out.println ( monthName );
      case 7: monthName = "July";
              break;
      case 8: monthName = "August";
              break;
      case 9: monthName = "September";
              break;
      case 10: monthName = "October";
              break;
      case 11: monthName = "November";
              break;
      case 12: monthName = "December";
              break;
      default:  monthName = "error";
      }

      // Assigning days

      switch(month) {
        case 9:
        case 4:
        case 6:
        case 11: days = 30;
                 break;
        case 2:  days = 28;
                 break;
        default: days = 31;
      }

      System.out.println( days + " days hath " + monthName );
      System.out.println();
  }
}
