import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int two = scan.nextInt();
        int end = scan.nextInt();
        int d = two-start;
        int temp=start;
        for(int i=start;i<=end;i++){
            System.out.print(temp+" ");
            temp+=d;
            if(temp>end) break;
        }
    }

}
