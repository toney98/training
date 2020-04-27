package basics;

import java.util.Scanner;

public class week {
public static void main(String[] args)
{
	String day;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the day");
	day=scan.nextLine();
	switch(day)
	{
	case "monday":
		System.out.println("day is monday");
		break;
	case "tuesday":
		System.out.println("day is tuesday");
		break;
	default:
		System.out.println("invalid day");
		break;
	}
}	
}
