import java.util.*;
public class longest_prefix
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,y;
n=sc.nextInt();
String a[]=new String[100];
for(int x=0;ix<n;x++)
{
a[x]=sc.next();
}
String long,check;
if(a.length>0)
long=a[0];
for(int x=1;x<a.length;x++)
{
check=a[x];
for(y=0;y<Math.min(long.length(),a[x].length());y++)
{
if(long.charAt(y)!=check.charAt(y))
break;
}
long=a[x].subString(0,y);
}
System.out.println("longest prefix is:"+long);
}
}
