package BinarySearchPLM;

public class peakelement {
    public static int mountainPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) { // moutain hell peak
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 1};
        int resut = mountainPeak(arr);
        System.out.println(resut);
    }
}