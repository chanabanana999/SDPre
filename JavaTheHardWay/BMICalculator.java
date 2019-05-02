import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;

    System.out.println();
    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
    System.out.println();

    /* Study Drill #1 below */

    double heightininches, weightinpounds, convert_to_m, convert_to_kg, newbmi;

    System.out.println();
    System.out.print( "Your height in inches: " );
    heightininches = keyboard.nextDouble();
    convert_to_m = ( heightininches / 39.37 );

    System.out.print( "Your weight in pounds: " );
    weightinpounds = keyboard.nextDouble();
    convert_to_kg = ( weightinpounds / 2.205);

    newbmi = convert_to_kg / ( convert_to_m * convert_to_m);

    System.out.println( "Your BMI is " + newbmi );
    System.out.println();

    /* Study Drill #2 is below */
    double heightinfeet, additionalinches, weight_pounds, feet_to_m;
    double inches_to_m, total_m, pounds_to_kg, newbmi2;

    System.out.println();

    System.out.print( "Your height (feet only): " );
    heightinfeet = keyboard.nextDouble();
    feet_to_m = ( heightinfeet / 3.281 );

    System.out.print( "Your height (remaining inches): " );
    additionalinches = keyboard.nextDouble();
    inches_to_m = ( additionalinches / 39.37 );
    total_m = ( feet_to_m + inches_to_m );

    System.out.print( "Your weight in pounds: " );
    weight_pounds = keyboard.nextDouble();
    pounds_to_kg = ( weight_pounds / 2.205);

    newbmi2 = pounds_to_kg / ( total_m * total_m );

    System.out.println( "Your BMI is " + newbmi2 );
    System.out.println();

  }
}
