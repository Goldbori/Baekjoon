import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tcase = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> User_list = new HashSet<>();

        boolean newMember = true;
        int gomcnt = 0;
        while (Tcase-->0){
            String user = br.readLine();
            if (user.equals("ENTER")){
                newMember = true;
                User_list.clear();
                continue;
            }

            
           if (User_list.contains(user)){
                continue;
           }
           if (newMember){
                
                gomcnt++;
                User_list.add(user);
           }
        }
        bw.write(String.format("%d",gomcnt));
        bw.flush();
        
    }
}