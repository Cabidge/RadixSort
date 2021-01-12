public class Tester {
	public static void main(String[] abc) {
		System.out.println("Expects 5: "+Radix.nth(12345, 0));
		System.out.println("Expects 4: "+Radix.nth(12345, 1));
		System.out.println("Expects 2: "+Radix.nth(12345, 3));
		System.out.println("Expects 0: "+Radix.nth(12345, 5));
		
		System.out.println("Expects 1: "+Radix.length(1));
		System.out.println("Expects 2: "+Radix.length(15));
		System.out.println("Expects 2: "+Radix.length(-10));
		System.out.println("Expects 4: "+Radix.length(5112));
	}
}
