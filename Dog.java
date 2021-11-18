//hierarchical inherutance
public class Dog extends Animals
{
public static void main(String[] args)
{
Dog d=new Dog();
d.bark();
d.bite();
d.walk();
d.run();

}
public void bark()
{
System.out.println("dogs can bark");
}
public void bite()
{
System.out.println("dogs can bite");
}
}