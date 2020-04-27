package basics;
import java.util.Scanner;
public class menu {
		static void addNumb(int num1,int num2)
		{
		int c;
		c=num1+num2;
		System.out.println(+c);
		}
	static int multiply(int value1,int value2)
	{
		int p;
		p=value1*value2;
		return p;
	}
	public static void main(String[] args)
	{
		int a,b,op,ch;
		do
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("MENU 1.add 2.multiply 3.exit");
		op=scan.nextInt();
		switch(op)
		{
		case 1:
			addNumb(a,b);
			break;
		case 2:
			System.out.println(multiply(a,b));
			break;
		case 3: break;
		default:
			System.out.println("invalid choice");
			break;
		}
			System.out.println("do you want to continue?1.yes 2.no");
			ch=scan.nextInt();
		}while(ch==1);			
	}
}
