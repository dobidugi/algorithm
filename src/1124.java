import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       String data;
       String st1="";
       String st2="";
       int a,b;
       boolean flag=false;
       data = scan.nextLine();
       for(int i=1 ;i<data.length();i++){
           if(data.charAt(i) >= 48 && data.charAt(i)<=57 && flag == false){
               st1 += data.charAt(i);
           }
           else if (data.charAt(i) >= 48 && data.charAt(i)<=57 && flag == true){
               st2 += data.charAt(i);
           }
           else{
               flag = true;
           }
        }
        a = Integer.parseInt(st1);
        b = Integer.parseInt(st2);
        System.out.print((a*12)+(b*1));
    }
}
