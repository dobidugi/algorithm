import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a;
        int arr[] = new int[100];
        int i=0;
        while(true){
            arr[i] = b%2;
            b = b/2;
            if(b==0) break;
            if(b==1){
                arr[i+1] = b;
                i++;
                break;
            }
            i++;
        }
        for(int j=i;j>=0;j--){
            System.out.print(arr[j]);
        }
        
    }
}