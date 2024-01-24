import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        int cnt = Integer.parseInt(st.nextToken());
        int target_rank = Integer.parseInt(st.nextToken());
        Integer[] scores = new Integer[cnt];
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < cnt ; i++){
            scores[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[target_rank-1]);


    }
}