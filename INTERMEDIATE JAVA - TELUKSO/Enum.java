enum Status { // NAMED CONSTANTS
  Running, Failed, Pending, Suceess;
}

enum Laptop {
  MacBook(2000), XPS(1000), Surface, ThinkPad(2000);

  private int price;

  private Laptop() {
    price = 500;
  }

  private Laptop(int price) {
    this.price = price;
    System.out.println("in laptop " + this.name());
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}

class Enum {

  public static void main(String[] args) {

    // Status s = Status.Running;

    // Status[] values = Status.values();
    // for (Status sValue : values) {
    // System.out.println(sValue + ":" + sValue.ordinal());

    // }
    // System.out.println(s);
    // System.out.println(s.ordinal());

    // Enum with if and else, switch!

    // if (s == Status.Running) {
    // System.out.println("Running");
    // } else if (s == Status.Pending) {
    // System.out.println("Pending");
    // }

    // switch (s) {
    // case Running:
    // System.out.println("Running");
    // break;
    // case Pending:
    // System.out.println("Pending");
    // break;
    // case Failed:
    // break;
    // case Suceess:
    // break;
    // default:
    // break;
    // }

    // System.out.println(s.getClass().getSuperclass());

    Laptop lap = Laptop.MacBook;
    System.out.println(lap);
    System.out.println(lap.getPrice());

    for (Laptop lapValue : Laptop.values()) {
      System.out.println(lapValue + ":" + lapValue.getPrice());

    }

    // lap.setPrice(1200);
    // for (Laptop lapValue : Laptop.values()) {
    // System.out.println(lapValue + ":" + lapValue.getPrice());

    // }

  }
}
