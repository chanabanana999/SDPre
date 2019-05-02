import static java.lang.System.*;
import java.util.Scanner;

public class CollegeAdmission {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int math;

    out.println();
    out.println( "Welcome to the UT Austin College Admissions Interface!" );
    out.print( "Pleae enter your SAT math score (200 - 800): " );
    math = keyboard.nextInt();

    out.print( "Admittance status: " );

    if ( math >= 790 )
      out.print( "CERTAIN " );
    //Drill #2 below
    // else if ( math >= 390 )
    //    out.print( "UNLIKELY " );
    // Drill 1: get rid of all "else" in program
    else if ( math >= 710 )
      out.print( "SAFE " );
    // else
    else if ( math >= 580 )
      out.print( "PROBABLE " );
    // else
    else if ( math >= 500 )
      out.print( "UNCERTAIN " );
    // else
    else if ( math >= 390 )
      out.print( "UNLIKELY " );
    // else // below 390
    else out.print( "DENIED " );
    out.println();
    out.println();
  }
}
