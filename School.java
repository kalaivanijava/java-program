public class School extends Govt
{
public static void main(String[] args)
{
Govt s=new School();
//s.teach();
//s.play();
//s.test();
s.conductexams();
s.correct();
}
public void conductexams()
{
System.out.println(" public exams");
}
public void play()
{System.out.println(" playing");
}
public void teach()
{System.out.println(" teaching");
}
public void test()
{System.out.println(" school exam");
}
}