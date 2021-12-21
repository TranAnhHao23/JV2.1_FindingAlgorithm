package binary_search_recursive;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int first = 0;
        int last = ints.length - 1; // OR last bỏ trừ 1 đi
        int number = 2;

        System.out.println(binarySearch(ints, number, first, last));
    }

    public static int binarySearch(int[] ints, int number, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2 + 1;
            if (ints[mid] == number) {
                return mid;
            } else if (ints[mid] < number) {
                first = mid + 1;
                return binarySearch(ints, number, first, last);
            } else {
                last = mid - 1;
                return binarySearch(ints, number, first, last);
            }
        }
        return -1;
    }
}
