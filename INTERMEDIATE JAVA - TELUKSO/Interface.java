public class Interface implements ABC, ABC2 {
  public void show() {
    System.out.println("Interface");
  }

  public static void main(String[] args) {
    ABC2 a = new Interface();
    a.show();
    System.out.println(ABC.age);
  }

}

interface ABC2 {
  void show();
}

interface ABC {
  void show();

  int age = 10; // variables are final and static

}