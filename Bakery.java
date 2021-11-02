public class Bakery
{
static String bakeryname="kalaivani";
int doorno=4;
	int price;
public static void main(String[] args)
{
	
Bakery cake=new Bakery();
	cake.price=20;
Bakery cooldrinks=new Bakery();
	cooldrinks.price=10;
Bakery vadai=new Bakery();
	vadai.price=20;
Bakery bonda= new Bakery();
	System.out.println(bakeryname);
	System.out.println(cake.price);
	System.out.println(cooldrinks.price);
	System.out.println(vadai.price);
}
}
