public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }

    for (int g = 0; g < 10; g++) {
      if (g == 4) {
        continue;
      }
      System.out.println(g);
    }

    int j = 0;
    while (j < 10) {
      System.out.println(j);
      j++;
      if (j == 4) {
        break;
      }
    }

    int m = 0;
    while (m < 10) {
      if (m == 4) {
        m++;
        continue;
      }
      System.out.println(m);
      m++;
    }
  }
}
