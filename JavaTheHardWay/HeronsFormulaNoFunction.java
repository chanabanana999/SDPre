public class HeronsFormulaNoFunction {
  public static void main(String[] args) {
    int a, b, c;
    double s, A;

    a = 3;
    b = 3;
    c = 3;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 3,3,3 has area " + A );

    a = 3;
    b = 4;
    c = 5;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 3,4,5 has area " + A );

    a = 7;
    b = 8;
    c = 9;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 7,8,9 has area " + A );

    a = 5;
    b = 12;
    c = 13;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 5,12,13 has area " + A );

    a = 10;
    b = 9;
    c = 11;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 3,3,3 has area " + A );

    a = 8;
    b = 15;
    c = 17;
    s = (a+b+c) / 2;
    A = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
    System.out.println( "A triangle with sides 3,3,3 has area " + A );
    System.out.println();
  }
}