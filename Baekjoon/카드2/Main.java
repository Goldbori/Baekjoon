import java.util.*;
import java.io.*;



class Main{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> st = new LinkedList<>();
        
        for (int i = 1 ; i <= N ; i++){
            st.add(i);
        }
             
        while (st.size()!=1){  // 스택의 카드가 1장 남을 때 까지 반복할거야
            st.poll();  //가장 위의 카드를 버린다.
            st.add(st.poll());
            
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", st.peek()));
        bw.flush();
    }
}