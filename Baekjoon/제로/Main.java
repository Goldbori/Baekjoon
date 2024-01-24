import java.util.*;
import java.io.*;


class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> st = new Stack<>();
        int Tcase = Integer.parseInt(br.readLine());

        while (Tcase-->0){
            int insert_val = Integer.parseInt(br.readLine());
            if (insert_val==0){
                st.pop();
            }
            else st.push(insert_val);
        }
        int answer = 0;

        for (int i : st){
            answer += i;
        }

        System.out.println(answer);

    }
}