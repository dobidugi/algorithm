import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size =scan.nextInt();
        String[] arr = new String[size];
        String st;
        for(int i=0;i<size;i++){
            arr[i]= scan.next();
        }
        for(int i=0;i<size;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.println();
        }
    }
}
