import java.util.*;
import java.io.*;


class Main{

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String next_line = br.readLine();
        while (!next_line.equals(".")){
            Stack<Character> st = new Stack<>();
            //Stack<String> st2 = new Stack<>();
            char[] vals = next_line.toCharArray();
            //System.out.println(Arrays.toString(vals));
            
            for (char i : vals){
                if (i != 40 && i != 41 && i != 91 && i != 93) continue;

                if (i == 40 || i == 91) st.push(i);
                else{
                    if (st.size()== 0){ st.push(' '); break;}
                    
                    char tmp = st.pop();
                    if ((tmp+i)==81 || (tmp+i)==184) continue;
                    else st.push(tmp); break;
                    
                }
            }
            //System.out.println(st.toString());
            if (st.size()==0){
                System.out.println("yes");
            }
            else System.out.println("no");
            next_line = br.readLine();
        }
        

    }
}