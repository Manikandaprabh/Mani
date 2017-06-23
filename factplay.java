import java.util.Scanner;
 
class Factorial
{
   public static void main(String args[])
   {
      int a, c, fact = 1;
 
      System.out.println("Enter an integer to calculate it's factorial");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
 
      if ( a < 0 )
         System.out.println("Number should be non-negative.");
      else
      {
         for ( c = 1 ; c <= a ; c++ )
            fact = fact*c;
 
         System.out.println("Factorial of "+a+" is = "+fact);
      }
   }
}
