import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tcase = Integer.parseInt(br.readLine());
        int[] num_arr = new int[Tcase];
        int cnt = 0;
        while(Tcase-->0){
            num_arr[cnt++] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num_arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "";
        for (int x : num_arr){
            bw.write(x + "\n");
        }
        bw.flush();
        bw.close();
    }
}