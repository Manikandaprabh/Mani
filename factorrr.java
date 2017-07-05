import java.util.Scanner;
 
class Factorial
{
   public static void main(String args[])
   {
      int n, b, fact = 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if ( n < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( b = 1 ; b <= n ; b++ )
            fact = fact*b;
 
         System.out.println("Factorial of "+n+" is = "+fact);
      }
   }
}
