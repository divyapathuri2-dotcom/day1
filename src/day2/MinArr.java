package day2;

public class MinArr {
    public static void main(String[] args) {

        int[] arr = {10, 5, 7, 2, 50};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum element: " + min);
    }
}