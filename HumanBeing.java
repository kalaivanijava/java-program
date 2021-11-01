public class HumanBeing
{
static int salary=25000;
	int empid;
public static void main(String[] args)
{
HumanBeing hb1=new HumanBeing();
	HumanBeing hb2=new HumanBeing();
	hb1.empid=123;
	hb1.purchase();
	//System.out.println(salary);
	//System.out.println(hb1.empid);
	
	//System.out.println(hb1.empid);
	//System.out.println(hb2.empid);
	
	//System.out.println("Amount of purchasing "+amount);
	//hb2.empid=777;
	hb2.purchase();
}
	public void purchase()
	{
	System.out.println(this.empid);
		System.out.println(salary);
		//int amount=200;
		//System.out.println("Amount of purchasing "+amount);
}
}
