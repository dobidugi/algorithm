import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum=0;
        String[] st = new String[size];
        String[] arr;
        for(int i=0;i<size;i++){
            st[i] = scan.next();
        }
        for(int i=0;i<size;i++){
            arr = st[i].split(",");
            sum+=arr.length-3;
        }
        System.out.print(String.format("%.2f",(float)sum/size));
    }
}
