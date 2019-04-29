import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double firstNumber, secondNumber, sum;

    Scanner input = new Scanner(System.in);

    sum = 0;
    System.out.println();
    System.out.println( "Please enter a number:" );
    firstNumber = input.nextDouble();
    System.out.println( "Please enter another number:" );
    secondNumber = input.nextDouble();
    sum = firstNumber + secondNumber;
    System.out.println( "The sum of " + firstNumber + " + " + secondNumber + " = " + sum );
    System.out.println();

    input.close();
  }
}
