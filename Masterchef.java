//single inheritance
package master;
import cooking.Cook;
public class Masterchef extends Cook 
{
public static void main(String[] args)
{
Masterchef m=new Masterchef();
m.makeicecream();                
m.makebriyani();
m.makerice();
Cook c=new Cook();
c.makerice();

}
public void makeicecream()
{
System.out.println(" master making icecream");
}
public void makebriyani()
{
System.out.println("Master making briyani");
}
public void makerice()
{
System.out.println("master making rice");
}
}
