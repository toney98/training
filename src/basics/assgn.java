package basics;
import java.util.Scanner;
public class assgn {

public static int add(int l)
{
	int i,sum=0;
	
	for(i=0;i<=l;i++)
	{
		sum=sum+i;
	}
	
	return sum;
}
	
	public static void main(String[] args)
{
	int n,c=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the limit");
	n=scan.nextInt();
	c=add(n);
	System.out.println(c);
}
}
