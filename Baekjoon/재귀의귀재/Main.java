import java.util.*;
import java.io.*;




class Main {
    static int recursion_cnt = 0;
    static int isPalindrom(String word){

        return recursion(word, 0, word.length() - 1);

    }

    public static int recursion(String s, int l, int r){
        recursion_cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int Tcase = Integer.parseInt(br.readLine());

        while (Tcase-->0){
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(isPalindrom(br.readLine())) + " " + Integer.toString(recursion_cnt));
            System.out.println(sb);
            recursion_cnt = 0;
        }
        
    }
}