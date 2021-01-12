public class Tester {
	public static void main(String[] abc) {
		System.out.println("Expects 5: "+Radix.nth(12345, 0));
		System.out.println("Expects 4: "+Radix.nth(12345, 1));
		System.out.println("Expects 2: "+Radix.nth(12345, 3));
		System.out.println("Expects 0: "+Radix.nth(12345, 5));
	}
}
