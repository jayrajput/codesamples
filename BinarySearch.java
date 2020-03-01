public class BinarySearch {

    // recursive binary search
    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int low, int high) {
        if (low > high) return -1;
        int mid = low + ((high - low) / 2);
        if (key > a[mid]) {
            return rank(key, a, mid + 1, high);
        } else if (key < a[mid]) {
            return rank(key, a, low, mid - 1);
        } else {
            return mid;
        }
    }

    // iterative binary search
    private static int rank2(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (key > a[mid]) {
                low = mid + 1;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(rank(1, a));
        System.out.println(rank2(1, a));
    }
}
