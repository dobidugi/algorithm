import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        System.out.print(in);
        if(in==1) System.out.print("st");
        else if(in==2) System.out.print("nd");
        else if(in==3) System.out.print("rd");
        else if(in==11 || in==12 || in==13) System.out.print("th");
        else if(in>10 && in%10==1) System.out.print("st");
        else if(in>10 && in%10==2) System.out.print("nd");
        else if(in>10 && in%10==3) System.out.print("rd");
        else System.out.print("th");
    }
}