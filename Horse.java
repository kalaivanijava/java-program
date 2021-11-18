//hierarchical inherutance
public class Horse extends Animals
{
public static void main(String[] args)
{
Horse d=new Horse();
d.ride();
d.run();
d.walk();
d.run();

}
public void ride()
{
System.out.println("horse can ride");
}
public void run()
{
System.out.println("horse can run faster");
}
}

