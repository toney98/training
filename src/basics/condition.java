package basics;
import java.util.Scanner;
public class condition {
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temperature");
		int temp=scan.nextInt();
		if(temp>=30)
		{
		System.out.println("its hot");}
			else if(temp<=30){
				System.out.println("its moderate");}
			else if(temp==30){
				System.out.println("temperature is 30 degree");
			}
		else {
			System.out.println("wrong input");}
	}
	

}
