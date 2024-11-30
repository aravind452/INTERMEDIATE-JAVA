public class Inheritance2 {

  public static void main(String[] args) {
    Parent p = new Child();
    p.display();
   // Child c = new Parent();

   // Child cs = (Child) p;
  }


  
}



class Parent {


  void display(){

  }

}

class Child extends Parent{
  void childDisplay(){

  }
}
