
import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException{
        Scanner scin = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr1 = new ArrayList<>();
        HashSet<String> arr2 = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();
       
        while (N-->0){

            arr1.add(br.readLine());
        }
    
        while (M-->0){
            arr2.add(br.readLine());
        }
        
        for (String i : arr1){
            if (arr2.contains(i)){
                answer.add(i);
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for (String i : answer){
            sb.append(String.format("%s%n",i));
        }
        bw.write(sb.toString());
        bw.flush();
        
        scin.close();
    }
}