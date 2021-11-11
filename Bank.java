public class Bank
{ int no;
	public Bank(int no)
	{
		this.no=no;
		System.out.println("check constructor");
	}	
public static void main(String[] args)
{
Bank b1=new Bank(123);
Bank b2=new Bank(222);
	b1.deposit();
	b1.withdrawl();
	b1.purchase();
	b2.deposit();
	b2.withdrawl();
	b2.purchase();
	
	
}
public void deposit()
{
	System.out.println("deposit account no : "+no);
}
public void withdrawl()
{
	System.out.println("withdraw account no : "+no);
}
public void purchase()
{
	System.out.println("purchase account no : "+no);
}
}
