package day2;
public class Searchelement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int find = 40;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}


