package Chapter_1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{3, 4, 6, 13, 25, 66, 78, 102, 234, 333, 456, 678, 788, 811, 923, 1002, 1007, 1102};
        System.out.println(binarySearch(sortedArray, 678));
    }

    private static int binarySearch(int[] sortedArray, int searchElem) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + high;
            int guess = sortedArray[mid];

            if (guess == searchElem) {
                return mid;
            }

            if (guess > searchElem) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
