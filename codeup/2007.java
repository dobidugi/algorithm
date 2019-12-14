import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int[] ucopy = new int[size];
        int[] dcopy = new int[size];
        boolean uflag = false;
        boolean dflag = false;
        int temp;
        for(int i=0;i<size;i++) arr[i] =scan.nextInt();
        ucopy =arr.clone();
        dcopy =arr.clone();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(ucopy[i]<ucopy[j]){
                    temp = ucopy[i];
                    ucopy[i] = ucopy[j];
                    ucopy[j] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(dcopy[i]>dcopy[j]){
                    temp = dcopy[i];
                    dcopy[i] = dcopy[j];
                    dcopy[j] = temp;
                }
            }
        }

        for(int i=0;i<size;i++){
            if(ucopy[i]==arr[i]) {
                uflag = true;
            }
            else{
                uflag = false;
                break;
            }
        }
        
        for(int i=0;i<size;i++){
            if(dcopy[i]==arr[i]) {
                dflag = true;
            }
            else{
                dflag = false;
                break;
            }
        }
        
        if(uflag==true && dflag==false) System.out.print("오름차순");
        if(dflag==true && uflag==false) System.out.print("내림차순");
        if(uflag==false && dflag==false) System.out.print("섞임");
    }
}
