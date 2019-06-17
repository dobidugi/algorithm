import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] arr;
        int size = scan.nextInt();
        arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.print((i+1)+": ");
            for(int j=0;j<size;j++){
                if(i!=j){
                    if(arr[i]==arr[j]) System.out.print("= ");
                    else if(arr[i]>arr[j]) System.out.print("> ");
                    else if(arr[i]<arr[j]) System.out.print("< ");
                }

            }
            
            System.out.println("");
        }
    }
}