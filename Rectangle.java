class Rectangle
{
public static void main(String[] args)
{
Rectangle r=new Rectangle();
System.out.println("Rectangle area is  :"+r.area(5,5));
int p=r.perimeter(5,5);
System.out.println("rectangle premeter is  :" +p);
}
public int area(int l,int b)
{
return l*b;
}
public int perimeter(int l,int b)
{
int c=2*(l+b);
return c;
}
}