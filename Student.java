public class Student extends Teacher
{
public static void main(String[] args)
{
Student t=new Student();
Teacher s=new Teacher();
s.teach();
s.homework();
t.learn();
t.homework();
}
public void learn()
{
System.out.println(" student larning");
}
public void homework()
{
System.out.println("Student doing homework ");
}
}