import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int in,loop,max=0;
        loop = scan.nextInt();
        for(int i=0;i<loop;i++){
            in = scan.nextInt();
            if(in>max){
                max = in;
            }
        }
        System.out.print(max);
    }
}