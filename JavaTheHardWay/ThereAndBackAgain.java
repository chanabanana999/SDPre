public class ThereAndBackAgain {
  public static void main(String[] args) {
    System.out.println( "Here." );

    // Drill #1: removing parens below resulted in "error: not a statement"
    erebor();
    System.out.println( "Back first time." );
    // Commenting out the line below prevents the function from being called,
    // and "There" does not show up.
    erebor();
    System.out.println( "Back second time." );
    System.out.println();
  }

  public static void erebor() {
    System.out.println( "There.");
  }
}
