import java.util.*;
import java.io.*;


class Main{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tcase = Integer.parseInt(br.readLine());
        
        while (Tcase-->0){
            Stack<String> st = new Stack<>();
            String[] vals = br.readLine().split("");
            //System.out.println(Arrays.toString(vals));
            for (String i : vals){
                if (i.equals(")")){
                    if (st.size() == 0){
                        st.add("i");
                        break;
                    }
                    else st.pop();
                }
                else st.push(i);
                
            }
            
            if (st.size()==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        

    }
}