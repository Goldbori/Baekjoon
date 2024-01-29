import java.util.*;
import java.io.*;

class Main{
    static StringBuilder sb = new StringBuilder();
    static int mv_cnt = 0;
   
    static int hanoi(int n, int start, int mid, int end){
        if (n==1){
            sb.append(String.format("%d %d\n",start,end));
            mv_cnt++;
            return 0;
        }

        hanoi(n - 1 , start, end, mid);
        sb.append(String.format("%d %d\n",start,end));
        mv_cnt++;
        
        hanoi(n - 1,mid,start,end);
        return 0;

    }

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tcase = Integer.parseInt(br.readLine());

        hanoi(Tcase,1,2,3);
        System.out.println(mv_cnt);
        System.out.println(sb);
    }
}