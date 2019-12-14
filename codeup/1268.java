import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int cnt=0;
        int in;
        int loop;
        loop = scan.nextInt();
        for(int i=0;i<loop;i++){
            in = scan.nextInt();
            if(in%2==0){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}