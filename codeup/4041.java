import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st= scan.nextLine();
        int temp=0;
        boolean flag = false;
        for(int i=st.length()-1;i>=0;i--) {
            
            if(st.charAt(i)=='0' && flag == false){
                continue;
            }
            else {
                flag = true;
                System.out.print(st.charAt(i));
            }  
        }
        System.out.println();
        for(int i=st.length()-1;i>=0;i--) temp+=(int)st.charAt(i)-'0';
        System.out.print(temp);
    }

}
