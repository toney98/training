package basics;
import java.util.Scanner;
public class loops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n=0;
		do
		{
			i=i+1;
			System.out.println(i);
		}while(i<5);
		
		while(n<10)
		{
			n=n+1;
			System.out.println(n);
		}
		int y=0;
		String[] states={"usa","texas","india"};
		boolean state=false;
		
		while(!state)
		{
			String st=states[y];
			if(st=="india")
			{
				System.out.println("state found");
				state = true;}
				else 
					{System.out.println("state not found");}
				y++;	
			}
			
		}	
	}
		
	
	
	


