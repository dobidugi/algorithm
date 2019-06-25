import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        for(int i=st.length()-1;i>=0;i--){
            System.out.print(st.charAt(i));
        }
    }
}
