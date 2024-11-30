package OOPS;



public class OOPS1 {
  public static void main(String[] args) {

    Student[] students = new Student[5];

    Student student1 = new Student(45, "arun", new float[] { 23, 4, 5 });

    students[0] = student1;

    for (Student s1 : students) {
      System.out.println(s1.rollno + " " + s1.name + " ");
    }

  }

}

final class Student {
  int rollno;
  String name;
  float[] marks;

  public Student(int rollno, String name, float[] marks) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
  }

  public Student() {

  }
}