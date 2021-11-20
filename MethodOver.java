package overload;
public class MethodOver
{
	public static void main(String[] args)
	{
		MethodOver mo=new MethodOver();
		mo.add(2,4);
		mo.add(2.2,2.3);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
}


