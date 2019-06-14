import java.util.*;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean flag = true,nflag=false;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=2;i<n;i++){
            if(n%i==0){
                arr.add(i);
                flag = false;
            }
        }
        for(int i=0;i<arr.size()+1;i++){
           for(int z = 2; z<arr.size();z++){
               if(arr.get(i) !=2 && arr.get(i)%z==0){
                   flag = true;
                   break;
                }
           }
        }
        if(n != 8 && flag==false){
            for(int i=0;i<arr.size();i++)
                System.out.print(arr.get(i)+ " ");
        }
        if(n==8 || flag==true) System.out.print("wrong number");
    }
}
