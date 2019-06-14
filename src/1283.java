import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int money;
        int day;
        double res;
        int[] per;
        money = scan.nextInt();
        day = scan.nextInt();
        res = money;
        per = new int[day];
        for(int i=0;i<day;i++){
            per[i] = scan.nextInt();
        }
        for(int i=0;i<day;i++){
            res = res + (res * per[i] / 100);
        }
        System.out.println(Math.round(res-money));
        if(money==res) System.out.print("same");
        else if(money>res) System.out.print("bad");
        else if(money<res) System.out.print("good");
    }
}