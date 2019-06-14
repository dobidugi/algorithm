import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double a,b,dd,cc=0;
        a = scan.nextDouble();
        b = scan.nextDouble();

        if(a<=150){
            cc = (a-100);
        }
        else if (a>150 && a<160){
            cc = ((a-150) /2)+50;
        }
        else if (a>=160){
            cc = (a-100)*0.9;
        }
        dd = (b-cc)*100/cc;
        if(dd<10) System.out.print("정상");
        else if(dd>=10 && dd<=20) System.out.print("과체중");
        else if(dd>20) System.out.print("비만");
    }
}