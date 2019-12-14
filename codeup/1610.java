import java.util.Scanner;
public class Main{
    public String re(String st,int start,int end){
        String re="";
        for(int i=start;i<start+end;i++) re+=st.charAt(i);
        return re;
    }
    public static void main(String args[]){
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        String st= scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
        st = m.re(st,start,end);
        System.out.print(st);
    }

}
