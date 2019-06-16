import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        int max,min;
        arr[0] = scan.nextInt();
        max = arr[0];
        min = arr[0];
        for(int i=1;i<5;i++){
            arr[i] = scan.nextInt();
            if(arr[i]>max) max = arr[i];
            else if(arr[i]<min)  min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}