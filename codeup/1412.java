import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st;
        int arr[] = new int[26];
        st  = scan.nextLine();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>=97 && st.charAt(i)<=122){
                arr[st.charAt(i)-'a'] += 1;
            }
        }
        int j=97;
        for(int i=0;i<26;i++){
            System.out.println(((char)j++)+ ":"+arr[i]);
        }

    }
}