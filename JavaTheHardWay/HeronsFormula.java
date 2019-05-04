public class HeronsFormula {
  public static void main(String[] args) {
    double a, g;
    String tws = "A triangle with sides ";

    System.out.println();

    a = triangleArea(3, 3, 3);
    System.out.println( "A triangle with sides 3, 3, 3 has area " + a );
    a = triangleArea(3, 4, 5);
    System.out.println( "A triangle with sides 3, 4, 5 has area " + a);
    a = triangleArea(7, 8, 9);
    System.out.println( tws + "7, 8, 9 has area " + a);

    System.out.println( tws + "5, 12, 13 has area " + triangleArea(5, 12, 13) );
    System.out.println( tws + "10, 9 , 11 has area " + triangleArea(10, 9 , 11) );
    System.out.println( tws + "8, 14, 17 has area " + triangleArea(8, 14, 17) );
    System.out.println( tws + "9, 9, 9 has area " + triangleArea(9, 9, 9) );
    System.out.println();
  }

  public static double triangleArea( int a, int b, int c) {

  double s, A;

  s = (a + b + c) / 2.0;
  A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
  return A;
  }
}
/* Study drill answers;
    1. This version is definitely "shorter" than the other version if by
    "shorter" we mean actual number of lines. However, there is more logic
    involved. Possibly more processing. The other is very straightforward
    and explicit. The first is going to be easier to maintain and modify, so
    lower total cost of ownership.
    2. Change / 2 to / 2.0 above. It would have required changing this
    in multiple places in the other version, and that could introduce
    errors.
    3. Embedded above.

    */
