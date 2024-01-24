import java.io.*;
import java.util.*;


class Main{

    public static void main(String[] args) throws IOException {
        HashMap<String,String> number_to_name = new HashMap<>();
        HashMap<String,String> name_to_number = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int id = 1;
        while(N-->0){
            String name = br.readLine();
            number_to_name.put(String.valueOf(id),name);
            name_to_number.put(name,String.valueOf(id++));
        }
        //System.out.println("-------------------------------------------");
        while (M-->0){
            String target_value = br.readLine();
            if (number_to_name.keySet().contains(target_value)){
                bw.write(number_to_name.get(target_value) + "\n");
                bw.flush();
            }
            else{
                bw.write(name_to_number.get(target_value) + "\n");
                bw.flush();
            }
        }
    }
}