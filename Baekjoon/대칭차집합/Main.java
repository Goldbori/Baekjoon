import java.util.*;
import java.io.*;



class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num_A = Integer.parseInt(st.nextToken());
        int num_B = Integer.parseInt(st.nextToken());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");
        HashSet<Integer> aSet = new HashSet<>(Arrays.asList());
        for (String i : A){
            aSet.add(Integer.parseInt(i));
        }
        for (String i : B){
            aSet.add(Integer.parseInt(i));
        }
        
        int answer = -num_A-num_B+2*aSet.size();

        bw.write(String.format("%d%n",answer));
        bw.flush();

        
        
    }
}