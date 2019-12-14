import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        String re = "";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='A' &&st.charAt(i)<='Z') re += st.charAt(i);
        }
        System.out.print(re);
    }
}
