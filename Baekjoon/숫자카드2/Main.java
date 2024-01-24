import java.util.*;
import java.io.*;


class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list_of_have = new ArrayList<>();
        HashMap<Integer,Integer> number_count_Map = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        int Tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (Tcase-->0){
            int val = Integer.parseInt(st.nextToken());
            //list_of_have.add(val);
            number_count_Map.put(val,number_count_Map.getOrDefault(val, 0) + 1);

        }

        //System.out.println(number_count_Map);
        Tcase = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        while(Tcase-->0){
            int key_val = Integer.parseInt(st2.nextToken());
            answer.append(number_count_Map.getOrDefault(key_val, 0)).append(' ');
        }
        bw.write(answer.substring(0,answer.length()-1));
        bw.flush();
    }
}