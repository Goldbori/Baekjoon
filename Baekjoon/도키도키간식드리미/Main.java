import java.util.*;
import java.io.*;

class Main{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tcase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> current_line = new Stack<>();
        Stack<Integer> waiting_line = new Stack<>();
        int receivedCount = 0;
        int cut_line = 1;
        waiting_line.push(Tcase+1);
        int t = Tcase;
        while (t-->0){
            current_line.push(Integer.parseInt(st.nextToken()));
        }
        current_line.push(0);
        Collections.reverse(current_line);
        while (receivedCount < Tcase){
            var val = current_line.peek();

            if (val > cut_line && waiting_line.peek() > cut_line){
                if (val > waiting_line.peek()) break;
                waiting_line.push(current_line.pop());
            }

            else if (val == cut_line){
                current_line.pop();
                cut_line++;
                receivedCount++;
                
            }

            else if (waiting_line.peek() == cut_line){
                waiting_line.pop();
                cut_line++;
                receivedCount++;
            }
        }
       
        if (receivedCount == Tcase){
            System.out.println("Nice");
        }
        else System.out.println("Sad");
    }
}