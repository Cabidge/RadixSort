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

		SortableLinkedList list = new SortableLinkedList();
		SortableLinkedList[] buckets = new SortableLinkedList[10];
		for (int i = 0; i < 10; i++) {
			SortableLinkedList bucket = new SortableLinkedList();
			for (int j = 0; j < 2; j++) {
				bucket.add(j + i * 10);
			}
			buckets[i] = bucket;
		}

		Radix.merge(list, buckets);
		System.out.println("Expects [0, 1, 10, 11, 20, 21...90, 91]");
		System.out.println(list);
	}
}
