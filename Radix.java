import java.lang.Math;

public class Radix {
    // get nth digit of an int, where 0 is the ones column, 1 is tens, etc.
    public static int nth(int n, int col) {
        int place = (int)Math.pow(10, col);
        return (n / place) % 10;
    }

    // return the number of digits in n
    public static int length(int n) {
        if (n == 0) return 1;

        return (int)Math.log10(Math.abs(n)) + 1;
    }

    public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
        for (SortableLinkedList bucket : buckets) {
            original.extend(bucket);
        }
    }

    public static void radixSortSimple(SortableLinkedList data) {
        if (data.size() <= 1) {
            return;
        }

        boolean loopedOnce = false;
        Integer current;
        int maxLength = 1;
        SortableLinkedList[] buckets = Radix.makeBuckets();
        for (int i = 0; i < maxLength; i++) {
            while (data.size() > 0) {
                current = data.remove(0);
                if (!loopedOnce) {
                    maxLength = Math.max(maxLength, Radix.length(current));
                }
                buckets[Radix.nth(current, i)].add(current);
            }
            Radix.merge(data, buckets);

            loopedOnce = true;
        }
    }

    public static void radixSort(SortableLinkedList data) {

    }

    private static SortableLinkedList[] makeBuckets() {
        SortableLinkedList[] buckets = new SortableLinkedList[10];
        for (int i = 0; i < 10; i++) {
            buckets[i] = new SortableLinkedList();
        }
        return buckets;
    }
}