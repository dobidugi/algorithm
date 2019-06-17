import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int odd = 0 ;
        int even = 0 ;
        int temp;
        boolean eflag =false;
        boolean oflag =false;
        int arr[] = new int[10];
        for(int i=0;i<10;i++) arr[i] = scan.nextInt();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<10;i++){
            if(eflag==true && oflag == true) break;
            if(arr[i]%2==0 && eflag==false){
                even = arr[i];
                eflag = true;
            }
            else if(arr[i]%2!=0 && oflag == false){
                odd =arr[i];
                oflag = true;
            }
        }
        if(oflag==true && eflag==true) System.out.print(odd + " " + even);
        else if(oflag==true) System.out.print(odd);
        else if(eflag==true) System.out.print(even);
        
    }
}