class Shop
{
int price,discount;
String brand;
	public Shop(String brand,int price,int discount)
	{
		//System.out.println("check me");
		this.price=price;
		this.discount=discount;
		this.brand=brand;
	}
	
public static void main(String[] args)
{
	Shop pro1=new Shop("sunsilk",100,10);
	System.out.println(pro1.price);
	System.out.println(pro1.discount);
	//pro1.price=100;
		//pro1.discount=10;
	//pro1.brand="sunsilk";
Shop pro2=new Shop("lux",80,8);
	//pro2.price=80;
	//pro2.discount=8;
	//pro2.brand="lux";
	
}
}