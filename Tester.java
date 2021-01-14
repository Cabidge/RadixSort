public class Tester {
	public static void main(String[] abc) {
		SortableLinkedList random = new SortableLinkedList();
		for (int i = 0; i < 10000000; i++) {
			random.add((int)(Math.random() * 1000));
		}
		System.out.println("Sort Random values:");
		Radix.radixSortSimple(random);
		System.out.println("Is sorted: " + Tester.isSorted(random));

		// System.out.println("Expects 5: "+Radix.nth(-12345, 0));
		// System.out.println("Expects 5: "+Radix.nth(12345, 0));
		// System.out.println("Expects 4: "+Radix.nth(-12345, 1));
		// System.out.println("Expects 4: "+Radix.nth(12345, 1));
		// System.out.println("Expects 2: "+Radix.nth(-12345, 3));
		// System.out.println("Expects 2: "+Radix.nth(12345, 3));
		// System.out.println("Expects 0: "+Radix.nth(-12345, 5));
		// System.out.println("Expects 0: "+Radix.nth(12345, 5));
		
		// System.out.println("Expects 1: "+Radix.length(1));
		// System.out.println("Expects 2: "+Radix.length(15));
		// System.out.println("Expects 2: "+Radix.length(-10));
		// System.out.println("Expects 4: "+Radix.length(5112));

		// System.out.println();
		// SortableLinkedList list = new SortableLinkedList();
		// SortableLinkedList[] buckets = new SortableLinkedList[10];
		// for (int i = 0; i < 10; i++) {
		// 	SortableLinkedList bucket = new SortableLinkedList();
		// 	for (int j = 0; j < 2; j++) {
		// 		bucket.add(j + i * 10);
		// 	}
		// 	buckets[i] = bucket;
		// }

		// Radix.merge(list, buckets);
		// System.out.println("Expects [0, 1, 10, 11, 20, 21...90, 91]");
		// System.out.println(list);
	
		// System.out.println();

		// SortableLinkedList random = new SortableLinkedList();
		// for (int i = 0; i < 1000; i++) {
		// 	random.add((int)(Math.random() * 1000 - 500));
		// }
		// System.out.println("Sort Random values:");
		// System.out.println(random);
		// Radix.radixSort(random);
		// System.out.println(random);
		// System.out.println("Is sorted: " + Tester.isSorted(random));

		// System.out.println();

		// SortableLinkedList sorted = new SortableLinkedList();
		// for (int i = -500; i < 1000; i += 7) {
		// 	sorted.add(i);
		// }
		// System.out.println("Sort Sorted values:");
		// System.out.println(sorted);
		// Radix.radixSort(sorted);
		// System.out.println(sorted);
		// System.out.println("Is sorted: " + Tester.isSorted(sorted));

		// System.out.println();

		// SortableLinkedList reversed = new SortableLinkedList();
		// for (int i = 500; i >= -500; i -= 7) {
		// 	reversed.add(i);
		// }
		// System.out.println("Sort Reversed values:");
		// System.out.println(reversed);
		// Radix.radixSort(reversed);
		// System.out.println(reversed);
		// System.out.println("Is sorted: " + Tester.isSorted(reversed));
	}

	public static boolean isSorted(SortableLinkedList data) {
		if (data.size() <= 1) {
			return true;
		}

		Integer current = data.remove(0);
		for (int i = 0; i < data.size(); i++) {
			Integer next = data.remove(0);
			if (current.compareTo(next) > 0) {
				return false;
			}
			current = next;
		}
		return true;
	}
}
