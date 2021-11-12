public class EShop
{
int price;
private	String profit="30%";

public EShop()
{
System.out.println(" Dec 31-rs 500 /-offer ");
}
public EShop(int price)
{
this();
this.price=price;
System.out.println(" your bill is"+price);
}
public static void main(String[] args)
{
EShop tv=new EShop(10000);
EShop fridge=new EShop(15000);
EShop enquiry=new EShop();
	tv.purchase(1000);
	fridge.purchase();
	tv.profit();
}
	public void purchase(int discount)
	{
       System.out.println(" discount price"+discount);
        int dis=price-discount;
		System.out.println(" t v After dicount "+dis);
	}
	public void purchase()
	{
		System.out.println("  fridge no discounts ");
	}
	private void profit()
	{
		System.out.println("profit "+profit);
	}
}
