import java.lang.Math;

public class Radix {
    // get nth digit of an int, where 0 is the ones column, 1 is tens, etc.
    public static int nth(int n, int col) {
        int place = (int)Math.pow(10, col);
        return (n / place) % 10;
    }

    // return the number of digits in n
    public static int length(int n) {
        return -1;
    }

    public static void merge(MyLinkedList original, MyLinkedList[] buckets) {

    }
}