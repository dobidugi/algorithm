import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        System.out.print(list.size());
    }
}
