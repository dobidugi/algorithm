import java.util.*;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       String name;
       int age;
       char code;
       float fl;
       name = scan.nextLine();
       age = scan.nextInt();
       code = scan.next().charAt(0);
       fl = scan.nextFloat();
       System.out.println(name);
       System.out.println(age);
       System.out.println(code);
       System.out.println(fl);

    }
}
