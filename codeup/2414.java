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
        String name = scan.next();
        for(int i=0;i<size;i++){
            arr = st[i].split(",");
            if(arr[0].equalsIgnoreCase(name)){
                System.out.print(arr[2]);
                break;
            }
        }
    }
}
