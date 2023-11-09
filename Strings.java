public class Strings{
	public static void main(String[] args) {

  String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println("The length of the txt string is: " + txt.length());

  String txt2 = "Hello World";
  System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
  System.out.println(txt2.toLowerCase());   // Outputs "hello world"

  String txt3 = "Please locate where 'locate' occurs!";
  System.out.println(txt3.indexOf("locate")); // Outputs 7

	String firstName = "John";
	String lastName = "Doe";
	System.out.println(firstName + " " + lastName);

	String thirdName = "John ";
	String fourthName = "Doe";
	System.out.println(thirdName.concat(fourthName));

	String a = "10";
	int b = 20;
	String z = a + b;  // z will be 1020 (a String)
	System.out.println(z);
  }
}
