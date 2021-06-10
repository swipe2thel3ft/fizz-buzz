package edu.cnm.deepdive;

public class FizzBuzz {

  public static String fizzBuzz(int value) {
    String result;
    switch (value % 15) {
      case 0:
        result = "FizzBuzz";
        break;
      case 3:
      case 6:
      case 9:
      case 12:
        result = "Fizz";
        break;
      case 5:
      case 10:
        result = "Buzz";
        break;
      default:
        result = String.valueOf(value);
        break;
    }
    return result;
  }

}
