import java.io.*;
class Hcf
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the First no : ");
            int n1=Integer.parseInt(br.readLine());
            System.out.print("Enter the Second no : ");
            int n2=Integer.parseInt(br.readLine());
            int hcf=0;
            int m = Math.m(n1,n2);
             
            for(int x=m; x >= 1; x--)
            {
                if(n1%x == 0 && n2%x == 0)
                {
                    hcf = x;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
        }
    }
