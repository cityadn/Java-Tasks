public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    for (int g = 0; g <= 10; g = g + 2) {
      System.out.println(g);
    }

    // Outer loop
    for (int h = 1; h <= 2; h++) {
      System.out.println("Outer: " + h); // Executes 2 times

      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
    }

    //For-Each loop
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
