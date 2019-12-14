import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class Info implements Comparable<Info>{
    String name;
    int num;

    Info(String name,int num){
        this.name = name;
        this.num = num;
    }

    @Override
    public int compareTo(Info i){
        if(this.num == i.num){
            return 0;
        }
        else if(this.num < i.num){
            return 1;
        }
        else return -1;
    }

    public String getName(){
        return this.name;
    }

    public int getNum(){
        return this.num;
    }
}

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Info> i = new ArrayList<Info>();
        for (int j=0;j<num;j++){
            String name = scan.next();
            int dnum = scan.nextInt();
            i.add(new Info(name,dnum));
        }
        Collections.sort(i);
        System.out.print(i.get(2).getName());
    }
}