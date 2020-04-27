package basics;

import java.util.Scanner;

public class functions {
static void addNumb(int num1,int num2)
	{
	int c;
	c=num1+num2;
	System.out.println("sum is "+c);
	}
static int multiply(int value1,int value2)
{
	int p;
	p=value1*value2;
	return p;
}
public static void main(String[] args)
{
	int a,b;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter two numbers");
	a=scan.nextInt();
	b=scan.nextInt();
	addNumb(a,b);
	System.out.println(multiply(a,b));
}
}