package OOPS;

public class Association {

  public static void main(String[] args) {

    Student1 s = new Student1("aravind");
    Library l = new Library();
    l.lend("frozen", s);
    l = null;

  }

}

class Student1 {
  private String name;

  Student1(String name) {
    this.name = name;
  }

  public void borrowBook(String title) {
    System.out.println(this.name + " borrowed " + title);
  }

  public String getName() {
    return this.name;
  }
}

class Library {
  public void lend(String title, Student1 student) {
    student.borrowBook(title);
    System.out.println("book lent to " + student.getName());

  }

  Library() {
  }
}