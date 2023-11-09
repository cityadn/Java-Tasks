public class Main {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);

    int x = 10;
    int y = 9;
    System.out.println(x > y); // returns true, because 10 is higher than 9

    System.out.println(10 > 9); // returns true, because 10 is higher than 9

    int z = 10;
    System.out.println(z == 10); // returns true, because the value of x is equal to 10

    System.out.println(10 == 15); // returns false, because 10 is not equal to 15

    int myAge = 25;
    int votingAge = 18;
    System.out.println(myAge >= votingAge);
    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote.");
    }

      }
}
