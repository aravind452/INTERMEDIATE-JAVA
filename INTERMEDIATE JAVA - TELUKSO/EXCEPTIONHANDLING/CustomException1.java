package EXCEPTIONHANDLING;

public class CustomException1 {

  public static void main(String[] args) {
    try {
      throw new MyException("exception thrown");
    } catch (MyException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
  }

}

class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}

/*
 * public CustomCheckedException(String message): This is the constructor for
 * the class. It accepts a single argument of type String, which represents the
 * error message.
 * super(message): This calls the constructor of the parent class (Exception)
 * and passes the message to it. This ensures that the custom error message is
 * stored and can later be retrieved using getMessage() (inherited from
 * Throwable class).
 */

/*
 * When you call super(message): The string message is passed to the constructor
 * of the Exception class (or Throwable, the parent of all exceptions in Java).
 * 
 * Storage in Throwable Class: The Throwable class (which Exception extends) has
 * a private field called detailMessage where the message is stored. So when you
 * call super(message), the Throwable constructor assigns the message to this
 * private field.
 * The field detailMessage holds the value of the message passed to the
 * constructor.
 * When you call getMessage(), it retrieves this stored value from the
 * detailMessage field.
 */