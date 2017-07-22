import java.util.*;
public class  ArmstrongNo{
  public static void main(String[] args) {
		int num;
		int count=0;
		int temp, a;
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		temp = num ;
		while(num >0){
			a=num % 10;
			num = num / 10;
			count = count +(a*a*a);
		}
		if( temp == count){
			System.out.println("Given number is a armstrong number");
		}
		else{
			System.out.println("Given number is not a armstrong number");
		}
	}
}
