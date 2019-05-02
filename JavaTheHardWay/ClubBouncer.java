public class ClubBouncer {
  public static void main(String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8 ) ) {
      System.out.println();
      System.out.println( "You are allowed to enter the club." );
    }
    // Drill below
    // System.out.println( "Some garbage message." );
    // This did not work because the "else" is detached from "if". Error is:
    // 'else' without 'if'.
    else {
      System.out.println();
      System.out.println( "You are not allowed to enter the club." );
    }
    System.out.println();
  }
}
