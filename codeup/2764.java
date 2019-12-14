import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        System.out.print("+");
        for(int i=0;i<st.length();i++){
            System.out.print("-+");
        }
        System.out.println();
        System.out.print("|");
        for(int i=0;i<st.length();i++){
            System.out.print(st.charAt(i)+"|");
        }
        System.out.println();
        System .out.print("+");
        for(int i=0;i<st.length();i++){
            System.out.print("-+");
        }
    }
}
