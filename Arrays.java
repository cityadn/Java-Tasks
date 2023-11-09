public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);

    String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
    cars2[0] = "Opel";
    System.out.println(cars2[0]);
    // Now outputs Opel instead of Volvo

    String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars3.length);
    // Outputs 4

    String[] cars4 = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String g : cars4) {
      System.out.println(g);
    }

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    System.out.println(myNumbers[1][2]); // Outputs 7

    int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers2[1][2] = 9;
    System.out.println(myNumbers2[1][2]); // Outputs 9 instead of 7

    int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers3.length; ++i) {
      for(int j = 0; j < myNumbers3[i].length; ++j) {
        System.out.println(myNumbers3[i][j]);
      }
    }
  }
}
