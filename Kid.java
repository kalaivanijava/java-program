//parent constructor - using super keyword
public class Kid extends Parentss
{
String name;
public Kid(String name)
{
super(name);
this.name=name;
System.out.println(" child");
}

public static void main(String[] args)
{
Kid k=new Kid(" Malar ");
System.out.println(k.name);
k.call();
k.msg();
k.kidcall();
}
public void kidcall()
{
System.out.println(this.name+"calling");
}
}
