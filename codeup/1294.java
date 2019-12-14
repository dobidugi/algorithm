import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st;
        String res="";
        st = scan.nextLine();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' ') res+= st.charAt(i);
            else if(st.charAt(i)=='Z'){
                res += (char)((st.charAt(i)+26)+3);
            }
            else if(st.charAt(i)=='z'){
                res += (char)((st.charAt(i)-26)+3);
            }
            else if(st.charAt(i)=='Y'){
                res += (char)((st.charAt(i)+26)+3);
            }
            else if(st.charAt(i)=='y'){
                res += (char)((st.charAt(i)-26)+3);
            }
            else if(st.charAt(i)=='X'){
                res += (char)((st.charAt(i)+26)+3);
            }
            else if(st.charAt(i)=='x'){
                res += (char)((st.charAt(i)-26)+3);
            }
            else res += (char)(st.charAt(i)+3);
        }
        System.out.print(res);
    }
}