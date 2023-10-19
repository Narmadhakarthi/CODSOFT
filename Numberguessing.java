import java.util.Scanner;
public class Numberguessing {
 public static void guessing()
 {
  Scanner scanObj = new Scanner(System.in);
  int n = 1 + (int)(100 * Math.random());
  int a = 5;
  int x, p;

  System.out.println( "A number to be found is chosen between 1 to 100. You got 5 picks only!");

  for (x = 0; x < a; x++) {
  System.out.println("pick the number:");
  p =  scanObj.nextInt();
  if (n== p) {
   System.out.println( "Congratulations! You picked the correct number.");
   break;
  }

   else if (n > p ) {
        System.out.println("The num is greater than " + p);
    }
    else if (n < p) {
        System.out.println("The num is less than " + p);
    }
 }
 if (x == a) {
  System.out.println("You have played more than a trials.");
  System.out.println("The num was " + n);
 }
}
 public static void main(String arg[])
 {
  guessing();
 }
}
