import java.util.*;
import java.io.*;



class Main{



    static boolean stars(int limit, int n,int row, int col){
        if (n == limit){//base
            if (row%3 == 1 && col%3 ==1){
                return false;
            }
            return true;
        }

        else{
            if (stars(limit,n*3,row/3,col/3) && !(row%3 == 1 && col%3 ==1) ){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        for (int row = 0 ; row < num ; row++){
            for (int col = 0 ; col < num; col++){
                if (stars(num, 3, row, col)){
                    sb.append("*");
                }
                else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        
        System.out.println(sb.toString().strip());
        //basecase n = 3?
        //int[3][3] -> 공백의 좌표는 int[1][1] 즉 plane[(num-1)/2][(num-1)/2]의 값은 공백이다.
        //부분문제 = 3의 제곱수인 n이 주어질때 어떻게 그 자리가 공백인지 아닌지를 구분하는가?


    }
}
