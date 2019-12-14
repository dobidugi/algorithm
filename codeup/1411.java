import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[];
        int size;
        int temp;
        size = scan.nextInt();
        arr = new int[size+1];
        for(int i=1;i<=size-1;i++){
            temp = scan.nextInt();
            arr[temp] = temp;
        }
        for(int i=1;i<=size;i++){
            if(arr[i]==0){
                System.out.print(i);
                break;
            }
        }
    }
}