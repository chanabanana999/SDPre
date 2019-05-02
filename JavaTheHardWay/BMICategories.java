import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, height, weight;

    System.out.println();
    // Code below commented out for Drill #2
    // System.out.print( "Enter your BMI: " );
    // bmi = keyboard.nextDouble();

    System.out.print( "Enter your height in meters: " );
    height = keyboard.nextDouble();

    System.out.print( "Enter your weight in kilograms: " );
    weight = keyboard.nextDouble();
    bmi = weight / ( height * height);

    System.out.println( "Your BMI is: " + bmi );
    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    // Drill 1 below
    // if ( bmi < 25.0 ) {
    // This makes it seem like a whole new if chain is starting.
    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi <  30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
    System.out.println();
  }
}
