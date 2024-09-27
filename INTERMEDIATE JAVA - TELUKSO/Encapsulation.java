public class Encapsulation {

  public static void main(String[] args) {
    Human human = new Human();
    System.out.println(human.getName());
    System.out.println(human.getAge());

    human.setAge(10);
    human.setName("John");

  }

}

class Human {
  private int age;
  private String name;

  public Human() {
    this.age = 12;
    this.name = null;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}