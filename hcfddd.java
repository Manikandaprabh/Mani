package Mani;
public class Pro 
{
	public void printAscii(char a)
	{
		int p=0;
		char s=' ';
		for (int i = 1; i < 26; i++) 
		{
			s=(char)a;
			
		}
		
		System.out.println(s);
	}
  
	public static void main(String[] args) 
	{
		Pro pr=new Pro();
		char p=96;
		pr.printAscii(p);
	
    }
  
}