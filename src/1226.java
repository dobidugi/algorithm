import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] dang = new int[7];
        int[] in = new int[6];
        int cnt = 0;
        boolean bnsflag = false;
        for(int i=0;i<7;i++){
            dang[i] = scan.nextInt();
        }
        for(int i=0;i<6;i++){
            in[i] = scan.nextInt();
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(in[i]==dang[j]){
                    cnt++;
                }
            }
        }
        for(int i=0;i<6;i++){
            if(in[i]==dang[6]){
                bnsflag = true;
            }
        }
        if(cnt==6){
            System.out.print("1");
        }
        else if(cnt==5 && bnsflag == true){
            System.out.print("2");
        }
        else if(cnt==5){
            System.out.print("3");
        }
        else if(cnt==4){
            System.out.print("4");
        }
        else if(cnt==3){
            System.out.print("5");
        }
        else{
            System.out.print("0");
        }
    }
}