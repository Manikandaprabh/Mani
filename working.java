import java.util.*;
public class Holiday_Workingday
{
public static void main(String ar[])throws Exception
{
String day;
Scanner a=new Scanner(System.in);
day=a.next();
check(day);
}
public void check(String daa)
{
if(daa.equalsIgnoreCase("Sunday"))
System.out.println("false");
else
System.out.println("true");
}
}