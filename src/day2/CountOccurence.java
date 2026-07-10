package day2;

public class CountOccurence {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4, 3, 2};
        int target = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Element " + target + " occurs " + count + " times.");
    }
}
