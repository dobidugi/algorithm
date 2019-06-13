import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,cnt=0;
        a = scan.nextInt();
        for(int i=1;i<=a;i++){
            if(i%10==1){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}