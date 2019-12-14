import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        int res=0;
        for(int i=0;i<10;i++){
            res+= (int)st.charAt(i) - '0';
        }
        if(res%7==4) System.out.print("suspect");
        else System.out.print("citizen");
    }
}
