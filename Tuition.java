public class Tuition extends Student
{
public static void main(String[] args)
{
Tuition t=new Tuition();
t.teach();
t.homework();
t.learn();
t.learntuition();
t.tuitionhomework();
}
public void learntuition()
{
System.out.println(" Student learning from tution");
}
public void tuitionhomework()
{
System.out.println("doing tuition homework");
}
}