import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    // salesTax = price * 0.0825;
    // total = price + salesTax;

    System.out.println();
    System.out.print( "How much is the purchase price? ");

    price = keyboard.nextDouble();
    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total);
    System.out.println();
    
    /* Answers to Drill questions:
    The program does not compile with the 0 removed from price as is. It's
    probably undefined, then it gets used in a formula. If it's 0, it works, but
    then the rest gets messes up because multiplying by zero yields zero as
    a result.

    if the salesTax and total are calculated in the original position, there
    is an error unless price is initialized to zero. Once the statements are
    places in the correct order, it does not matter if the price is initialized
    because they input value overrides whatever was there.
    */
  }
}
