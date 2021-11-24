class Employer extends Person {
  public void getName() {
    System.out.println("Employer Name");
  }

  public static void main(String[] args) {
    Person p1 = new Employer();
    Person p2 = new Person();
    Employer e = new Employer();
    p1.getName();
    p2.getName();
    e.getName();
	  
  }
  }