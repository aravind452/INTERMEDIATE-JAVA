import java.util.*;

class Student implements Comparable<Student> {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(Student that) {
    if (this.age > that.age)
      return 1;
    else
      return -1;

  }

}

public class CompExample {

  public static void main(String[] args) {

    // List<Integer> nums = new ArrayList<>();

    // Comparator<Integer> cp = new Comparator<Integer>() {
    // public int compare(Integer a, Integer b) {
    // if (a % 10 > b % 10)
    // return 1;
    // else
    // return -1;
    // }

    // };

    // nums.add(12);
    // nums.add(33);
    // nums.add(55);
    // nums.add(71);
    // nums.add(12);
    // System.out.println(nums);
    // Collections.sort(nums, cp);
    // System.out.println(nums);

    // Student Object - Sorting based on the age of the student

    Comparator<Student> compStudent = new Comparator<Student>() {
      public int compare(Student a, Student b) {
        if (a.age > b.age)
          return 1;
        else
          return -1;
      }

    };
    List<Student> student = new ArrayList<>();

    student.add(new Student(21, "Navin"));
    student.add(new Student(12, "Aravind"));
    student.add(new Student(18, "Rahul"));
    student.add(new Student(20, "Kiran"));

    Collections.sort(student); // This works only if the comparable interface is implemented
    System.out.println(student);

    // Collections.sort(student, compStudent);

    // for (Student s : student) {
    // System.out.println(s);
    // }

  }

}
