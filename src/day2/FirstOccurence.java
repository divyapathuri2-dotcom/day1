package day2;

public class FirstOccurence {
    public static void main(String[] args) {

        int[] arr = {10, 2, 3, 2, 6};
        int target = 2;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("First occurrence is at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}