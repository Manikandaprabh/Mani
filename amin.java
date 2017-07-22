   import java.util.*;
  class ReverseString
 + {
 +    public static void main(String args[])
 +    { int x,n,y,sum,temp1;
 +       
 +       Scanner in = new Scanner(System.in);
 +  x= in.nextInt();
 +   y= in.nextInt();
 +   
 +  for(x=x+1;x<y;++x)
 +  {
 +  temp1=x;
 +sum=0;
 +
 +  while(temp1!=0)
 +  {
 +      n=temp1%10;
 +      sum=sum+(n*n*n);
 +      temp1=temp1/10;
 +  }
 +   if(x==sum)
 +    System.out.println(x);
 +  }
 +       
 +    }
 + }
