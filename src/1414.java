import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st;
        int ac=0,bc=0;
        st  = scan.nextLine();
        st+=".";
        for(int i=0;i<st.length();i++){
            
            if(((st.charAt(i)=='c') && (st.charAt(i+1)=='c')) || ((st.charAt(i)=='c') && (st.charAt(i+1)=='C'))) bc++;
            else if(((st.charAt(i)=='C') && (st.charAt(i+1)=='C')) || ((st.charAt(i)=='C') && (st.charAt(i+1)=='c'))) bc++;
            if(st.charAt(i)=='c' || st.charAt(i)=='C') ac++;
        }
        System.out.println(ac);
        System.out.print(bc);
    }
}