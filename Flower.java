public class Flower
{
int price;
int quantity;
public static void main(String[] args)
{
System.out.println("Welcome to flower shop");
Flower f=new Flower();
f.price=20;
f.buy();
}
public void buy()
	{
System.out.println("red roses Rs"+this.price);
}
}