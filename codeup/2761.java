import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = new int[3];
        arr[0] = a+b;
        arr[1] = a-b;
        arr[2] = a*b;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr[1]);
    }
}
