package nextgen;
import nineties.Phone;
public class Mobile extends Phone
{
public static void main(String[] args)
{
Mobile vivo=new Mobile();
vivo.call();
vivo.receivedcalls();
vivo.mobilecall();
}
public void mobilecall()
{
System.out.println("mobile calling");
}
}
