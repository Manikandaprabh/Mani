import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int y, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      y = in.nextInt();
 
      while( y != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          y = y/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}