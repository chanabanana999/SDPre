public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, extraint;
    double seconds, e, checking, extradouble;
    String firstName, lastName, title, extrastring1, extrastring2;

    x = 10;
    y = 400;
    age = 39;
    extraint = 42;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    extradouble = 3.14159;

    firstName = "Chana";
    lastName = "Cohn";
    title = "Ms.";
    extrastring1 = "Nahara";
    extrastring2 = "Wasser";

    System.out.println();
    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println();
    System.out.println( "Additional int variable: " + extraint );
    System.out.println( "Additional double variable: " + extradouble );
    System.out.println( "Additional strings: " + extrastring1 + " " + extrastring2 );
    System.out.println();
  }
}
