public class Operators{
	public static void main(String[] args) {

		int x = 100 + 50;
		System.out.println(x);

		int sum1 = 100 + 50;        // 150 (100 + 50)
		int sum2 = sum1 + 250;      // 400 (150 + 250)
		int sum3 = sum2 + sum2;     // 800 (400 + 400)
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

		int y = 10;
		y += 5;
		System.out.println(y);
  }
}
