//single inheritance
package cooking;
public class Cook
{
public static void main(String[] args)
{
Cook c=new Cook();
c.makerice();
}
public void makerice()
{
System.out.println("chef cooking  rice ");
}
public void makesalad()
{
System.out.println("chef making salad");
}
}