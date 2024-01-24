import java.util.*;
import java.io.*;


public class Test {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> dancePeople = new HashSet<>();
        int Tcase = Integer.parseInt(br.readLine());
        int dance = 0;
        while (Tcase-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String user1 = st.nextToken();
            String user2 = st.nextToken();

            if (user1.equals("ChongChong") || user2.equals("ChongChong")){
                dancePeople.add(user1);
                dancePeople.add(user2);
            
                continue;
            }

            if (dancePeople.contains(user1) || dancePeople.contains(user2)){
                dancePeople.add(user1);
                dancePeople.add(user2);
                
                continue;
            }

        }

        System.out.println(dancePeople.size());


    }
}
