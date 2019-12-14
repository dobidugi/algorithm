import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String st1= scan.nextLine();
        String temp = st1;
        st1 = st1.toUpperCase();
        boolean flag = true;
        for(int i=0;i<st1.length();i++){
            if(st1.charAt(i)==st1.charAt((st1.length()-1)-i)){
            
            }
            else { 
                flag =false;
            }
        }
        if(flag == true){
            System.out.println("Yes");
            if(temp.length()%2==0) {
                for(int i=0;i<temp.length()/2;i++) System.out.print(temp.charAt(i));
            }
            else{
                for(int i=0;i<(temp.length()/2)+1;i++) System.out.print(temp.charAt(i));  
            }
        }
        else if(flag==false){
            System.out.println("No");
            System.out.print(temp);
            for(int i=temp.length()-1;i>=0;i--) System.out.print(temp.charAt(i));
        }
    }
}
