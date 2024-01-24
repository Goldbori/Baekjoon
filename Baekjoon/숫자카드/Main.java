import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        String answer ="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        List<String> cards = n
        br.readLine();
        List<String> compare_cards = Arrays.asList(br.readLine().split(" "));
        for (String s : compare_cards){
            if (cards.contains(s)){
                answer += "1 ";
            }
            else answer += "0 ";
        }
        bw.write(answer.strip());
    }
}