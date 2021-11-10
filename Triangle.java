class Triangle
{
public static void main(String[] args)
{
Triangle t=new Triangle();
	int c=t.area(8,8);
System.out.println("Triangle area is  :"+c);
}
public int area(int h,int b)
{
int c=(h*b);
	return c/2;
}
}
