package day2;

public class Linearsearch {
    public static void main (String[] args){
        int[] arr={10,30,40,25,50};
        int target= 30;
        boolean found = false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                found= true;
                System.out.println("element found at index:"+ i);
                break;
            }
        }
    }
}
