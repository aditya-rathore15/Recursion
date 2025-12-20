package basic;

public class Lecture3ReverseArray {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int l, int r) {
        if(l >= r) {
            return;
        }

        swap(arr, l, r);
        reverse(arr, l+1, r-1);
    }

    private static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr, 0, arr.length - 1);
        print(arr);
    }
}
