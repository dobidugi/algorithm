import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        String res;
        int temp=0;
        while(true){
            for(int i=0;i<st.length();i++){
                temp = temp + (int)(st.charAt(i)-'0');
            }
            st = Integer.toString(temp);
            temp =0 ;
            if(st.length()-1==0) break;
        }
        System.out.print(st);
    }

}
