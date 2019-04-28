public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, csquared, hypotenuse;

    side1 = 30;
    side2 = 40;

    csquared = (side1 * side1) + (side2 * side2);
    hypotenuse = Math.sqrt(csquared);

    System.out.println();
    System.out.println(" The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse );
    System.out.println();
  }
}
