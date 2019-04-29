import java.util.Scanner;

public class Objective3Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;
    currentYear = 2019;

    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.println( "How old are you? ");
    age = input.nextInt();
    birthYear = currentYear - age;
    System.out.println( "You were born in " + birthYear);
    System.out.println();
    input.close();
    /*  This assumes they've already had their birthday this year.
        Otherwise, we need to ask the date of birth and check against
        today's date.
    */
  }
}
