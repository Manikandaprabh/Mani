public class Display
{
public static void main(String args[])
{
    for (int a = 0; a < 10; a++)
    {
        for (int b = 1; b <= 9; b++)
        {
            int c = a * 10 + b;
            if (c % 2 =0)
                System.out.print(c + " " );
        }
        System.out.println();
    }
}
}
