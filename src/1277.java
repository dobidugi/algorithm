import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        int[] d = new int[loop];
        for(int i=0;i<loop;i++){
            d[i] = scan.nextInt();
        }
        System.out.print(d[0] + " " +d[loop/2] + " "+ d[loop-1]);
    }
}