package day4;
import java.util.Scanner;
public class SelectionScanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements:");
        for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
        for (int i=0;i<n-1;i++){
            int minindex=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;

                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        }
}
