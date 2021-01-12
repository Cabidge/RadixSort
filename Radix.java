import java.lang.Math;

public class Radix {
    // get nth digit of an int, where 0 is the ones column, 1 is tens, etc.
    public static int nth(int n, int col) {
        int place = (int)Math.pow(10, col);
        return (n / place) % 10;
    }

    // return the number of digits in n
    public static int length(int n) {
        if (n == 0) return 0;

        return (int)Math.log10(Math.abs(n)) + 1;
    }

    public static void merge(MyLinkedList original, MyLinkedList[] buckets) {
        for (MyLinkedList bucket : buckets) {
            original.extend(bucket);
        }
    }
}