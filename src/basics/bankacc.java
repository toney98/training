package basics;
import java.util.Scanner;
public class bankacc {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	
	bankaccapp acc1=new bankaccapp();
	System.out.println(acc1.name="sarapi");
	acc1.setSsn("34567");
	System.out.println("ssn is" +acc1.getSsn());
	System.out.println(acc1.accno="1234");
	
	bankaccapp acc2=new bankaccapp(" savings ");
	acc2.setName("toney");
	System.out.println(acc2.getName());
	bankaccapp acc3=new bankaccapp("savings",5000);
	acc3.balance();
}
}
