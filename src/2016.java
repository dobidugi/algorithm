import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack= new Stack<Character>();
        Stack<Character> stack2= new Stack<Character>();
        int size = scan.nextInt();
        String st = scan.next();
        int conc = size/4;
        int cnt=0;
        String re="";
        for(int i=0;i<size;i++) stack2.push(st.charAt(i));
        
        while(!stack2.empty()){
            if(cnt==3){
                stack.push(',');
                stack.push(stack2.pop());
                cnt=0;
                cnt++;
            }
            else{
                cnt++;
                stack.push(stack2.pop());
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }

}
