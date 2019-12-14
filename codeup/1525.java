import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[][] map = new int[10][10];
        int[][] player;
        int in;
        int size;
        int temp;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                map[i][j] = scan.nextInt();
            }
        }
        in = scan.nextInt();
        player = new int[in][2];
        for(int i=0;i<in;i++){
            for(int j=0;j<2;j++) player[i][j] = scan.nextInt();
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){

                if(map[i][j]>=1){ //find boom
                    size = map[i][j];
                    //left crash
                    if(j-1!=-1 && (map[i][j-1]==0 || map[i][j-1]==-2)){
                        temp =j;
                        temp--;
                        if(temp==-1) break;
                        for(int b=0;b<size;b++){
                            if(map[i][temp]==0 || map[i][temp]==-2){
                                map[i][temp--] = -2;
                            }
                            else if(map[i][temp]>0){
                                map[i][temp]+=b;
                            }
                            if(temp==-1) break;
                        }
                    }

                    //right crash
                    if(j+1!=10 && (map[i][j+1]==0 || map[i][j+1]==-2)){
                        temp = j;
                        temp++;
                        if(temp==10) break;
                        for(int b=0;b<size;b++){
                            if(map[i][temp]==0 || map[i][temp]==-2){
                                map[i][temp++] = -2;
                            }
                            else if(map[i][temp]>0){
                                map[i][temp]+=b;
                            }
                            if(temp==10) break;
                        }
                    }

                    //bottom crash
                    if(i+1!=10 && (map[i+1][j]==0 || map[i+1][j]==-2)){
                        temp = i;
                        temp ++;
                        if(temp==10) break;
                        for(int b=0;b<size;b++){
                            if(map[temp][j]==0 || map[temp][j]==-2){
                                map[temp++][j] = -2;
                            }
                            else if(map[temp][j]>0){
                                map[temp][j]+=b;
                            }
                            if(temp==10) break;
                        }
                    }

                    //up crash
                    if(i-1!=-1 && (map[i-1][j]==0 || map[i-1][j]==-2)){
                        temp=i;
                        temp--;
                        if(temp==-1)break;
                        for(int b=0;b<size;b++){
                            if(map[temp][j]==0 || map[temp][j]==-2){
                                map[temp--][j] = -2;
                            }
                            else if(map[temp][j]>0){
                                map[temp][j]+=b;
                            }
                            if(temp==-1)break;
                        }
                    }
                map[i][j] = -2;
                }
            }
        }   
        for(int i=1;i<=in;i++){
            int a=player[i-1][0];
            int b=player[i-1][1];
            a--;
            b--;
            if(map[a][b]==0) map[a][b]=i;
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Character Information");
        for(int i=1;i<=in;i++){
            int a=player[i-1][0];
            int b=player[i-1][1];
            a--;
            b--;
            if(i!=in){
                if(map[a][b]==-2) System.out.println("player "+i+" dead");
                else System.out.println("player "+i+" survive");
            }
            else {
                if(map[a][b]==-2) System.out.print("player "+i+" dead");
                else System.out.print("player "+i+" survive");
            }
        }
    }
}