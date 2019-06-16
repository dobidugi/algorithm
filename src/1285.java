import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Queue<Integer> numQ = new LinkedList<Integer>();
        Queue<Character> eQ = new LinkedList<Character>();
        boolean loopflag = true;
        String st;
        String temp ="";
        int res=0;
        st = scan.nextLine();
        if(st.charAt(0)=='-'&& (st.charAt(1)>=48 && st.charAt(1)<=57)) temp += st.charAt(0);
        for(int i=0; i<st.length();i++){
            
            if((st.charAt(i)>=48) && (st.charAt(i)<=57)){
                temp+=st.charAt(i);
            }
            else if((i!=0)&&((st.charAt(i)>=48) && (st.charAt(i)<=57))==false){
                eQ.offer(st.charAt(i));
                numQ.offer(Integer.parseInt(temp));
                temp ="";
            }
        }
        res += numQ.poll();
        while(loopflag){
            switch(eQ.poll()){
                case '=':
                    loopflag=false;
                    break;
                case '+':
                    res += numQ.poll();
                    break;
                case '-':
                    res -= numQ.poll();
                    break;
                case '*':
                    res *= numQ.poll();
                    break;
                case '/':
                    res /= numQ.poll();
                    break;
            }
        }
        System.out.print(res);
    }
}