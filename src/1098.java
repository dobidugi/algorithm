import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int sizeX,sizeY;
        int stage[][];
        int datasize;
        int n,d,x,y;
        sizeX = scan.nextInt();
        sizeY = scan.nextInt();
        stage = new int[sizeX][sizeY];
        
        datasize = scan.nextInt();
        for(int i=0;i<datasize;i++){
            n = scan.nextInt();
            d = scan.nextInt();
            x = scan.nextInt();
            y = scan.nextInt();
            for(int loop = 0;loop<n;loop++){
                if(d==0){
                    if(y>sizeX) break;
                    stage[x-1][y-1]=1;
                    y++;
                }
                else if(d==1){
                    if(x>sizeY) break;
                    stage[x-1][y-1]=1;
                    x++;
                }
            }
        }

        for(int i = 0; i<sizeX;i++){
            for(int j=0; j<sizeY; j++){
                System.out.print(stage[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
