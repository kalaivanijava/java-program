public class Smart extends Watch
{

int price=50;
int prices;
public Smart(int prices)

{
this.prices=prices;
}
public static void main(String[] args)
{
	Smart s=new Smart(500);
	//super.buy();
	s.buy();
}
public void buy()
{
super.buy();
System.out.println(" Smart display"+super.price);
System.out.println(" name "+brand);
System.out.println(" price "+ this.prices);
}
}