import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st;
        String res="";
        st = scan.nextLine();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' ') res+= st.charAt(i);
            else if(st.charAt(i)=='A' || st.charAt(i)=='a'){
                res += (char)((st.charAt(i)+26)-3);
            }
            else if(st.charAt(i)=='B' || st.charAt(i)=='b'){
                res += (char)((st.charAt(i)+26)-3);
            }
            else if(st.charAt(i)=='C' || st.charAt(i)=='c'){
                res += (char)((st.charAt(i)+26)-3);
            }
            else res += (char)(st.charAt(i)-3);
        }
        System.out.print(res);
    }
}