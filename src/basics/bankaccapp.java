package basics;
import java.util.Scanner;
public class bankaccapp {
protected String name;
protected String accno;
protected String ssn;
final static String routno="789";
double balance;
bankaccapp()
{
	
	System.out.println("new account created");
	System.out.println("route number is " +routno);
}
bankaccapp(String type)
{
	
	System.out.println("account of type" +type+ "created");}
bankaccapp(String type,double indp)
{
	
	System.out.println("account of type " +type+ " with initial deposit of " +indp+ " created");
	balance=indp;
}

void balance()
{
	System.out.println("balance is " +balance);
}
public void setName(String name)
{
	this.name=name;
	}
public String getName()
{
	return("Mr."+name);
}
public String getSsn() {
	return ssn;
}
public void setSsn(String ssn) {
	this.ssn = ssn;
}

}
