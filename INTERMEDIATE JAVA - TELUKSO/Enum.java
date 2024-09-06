enum Status { // NAMED CONSTANTS
  Running, Failed, Pending, Suceess;
}

class Enum {

  public static void main(String[] args) {

    Status s = Status.Running;
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
    //   case Running:
    //     System.out.println("Running");
    //     break;
    //   case Pending:
    //     System.out.println("Pending");
    //     break;
    //   case Failed:
    //     break;
    //   case Suceess:
    //     break;
    //   default:
    //     break;
    // }

  }
}
