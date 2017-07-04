public class Display
{
public static void main(String args[])
{
    for (int j = 0; j < 10; j++)
    {
        for (int i = 1; i <= 9; i++)
        {
            int d = j * 10 + i;
            if (d % 2 !=0)
                System.out.print(d + " " );
        }
        System.out.println();
    }
}
}
