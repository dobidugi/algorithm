import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int stage[][] = new int[10][10];
        int x=1,y=1;
        boolean flag = false;
        for(int i = 0; i<10;i++){
            for(int j=0; j<10; j++){
                int temp = scan.nextInt();
                stage[i][j]=temp;
            }
        }
        if(stage[x][y]==0){
            stage[x][y]=9;
            flag = true;
        }
        while(flag){
            if(stage[x][y+1]==0){
                stage[x][y+1]=9;
                y++;
            }
            else if(stage[x][y+1]!=0 && stage[x+1][y]==0){
                stage[x+1][y]=9;
                x++;
            }
            else if((stage[x+1][y]!=0 && stage[x][y+1]!=0)){
                if(stage[x+1][y]==2) stage[x+1][y]=9;
                else if(stage[x][y=1]==2) stage[x][y+1]=9;
                break;

            }
        }

        //System.out.println("");
    
        for(int i = 0; i<10;i++){
            for(int j=0; j<10; j++){
                System.out.print(stage[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
