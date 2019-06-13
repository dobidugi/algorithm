import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] datas = new int[4];
        int cnt = 0;
        int a,b;
        for(int i=0; i<4;i++){
            datas[i]=scan.nextInt();
        }
        if(datas[0]>datas[1]){
            a = datas[1];
            b = datas[0];
        }
        else{
            a = datas[0];
            b = datas[1];
        }
        if(a<datas[2] && datas[2]<b){
            cnt++;
        }
        if(a<datas[3] && datas[3]<b){
            cnt++;
        }
        if(cnt==1){
            System.out.print("cross");
        }
        else{
            System.out.print("not cross");
        }
    }
}