package basics;
import java.util.Scanner;
public class fibon {
public static void main(String[] args)
{
	int c,f=0,i,l=0,fact=1,ch=0,d=0;
	do
	{
	System.out.println("MENU 1.FIBONACCI SERIES 2.FACTORIAL 3.EXIT");
	Scanner scan=new Scanner(System.in);
	ch=scan.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("enter the limit");
		c=scan.nextInt();
		if(c==0)
		{
			System.out.println("ans is: 0");
		}
		while(c!=0)
		{
			f=f+c;
			c--;
			
		}
		System.out.println(+f);
		break;
		case 2:
			System.out.println("enter the limit");
			l=scan.nextInt();
			if(l==0)
			{
				System.out.println("factorial is 1");
			}
			while(l!=0)
			{
				
				fact=fact*l;
		
				l--;
			}
			System.out.println(+fact);
			break;
		case 3:break;
	}
	
	System.out.println("DYWTC? 1.YES 2.NO");
	d=scan.nextInt();
	}while(d!=2);
	
	
	
	}
}