public class Example2 {

  public static void main(String[] args) {
    int myVar1;
    int myVar2;
    int x;
    double v;

    x = 10;
    v = 10.0;

    myVar1 = 1024;

    System.out.println("myVar1 contain: " + myVar1);

    myVar2 = myVar1 / 2;

    System.out.print("myVar2 contains myVar1 / 2: ");
    System.out.println(myVar2);

    System.out.println("Original value of x: " + x);
    System.out.println("Original value of v: " + v);
    System.out.println();

    x = x / 4;
    v = v / 4;

    System.out.println("x after division: " + x);
    System.out.println("v after division: " + v);
  }
}