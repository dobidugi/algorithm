import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        int cnt=0;
        for(int i=0;i<st.length();i++) if(st.charAt(i)=='3' || st.charAt(i)=='6' || st.charAt(i)=='9') cnt++;
        if(cnt!=0) for(int i=0;i<cnt;i++) System.out.print("K");
        else System.out.print(st);
    }
}
