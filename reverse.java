import java.util.*;
class hcf
{
    public static void main(String Args[])
    {
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int a=1;
        int p=x*y;
        for(int i=2;i<p;i++)
        {
            if((x%i==0)&&(y%i==0))
            {
                a=i;
            }
        }
        System.out.println("HCF="+a);
    }
}