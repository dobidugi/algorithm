import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int Mcnt =0;
        int Fcnt =0;
        String[] st = new String[size];
        String[] arr;
        for(int i=0;i<size;i++){
            st[i] = scan.next();
        }
        for(int i=0;i<size;i++){
            arr = st[i].split(",");
                if(arr[1].equalsIgnoreCase("M")) Mcnt++;
                else Fcnt++;
        }
        System.out.println(Mcnt);
        System.out.print(Fcnt);
        
    }
}
