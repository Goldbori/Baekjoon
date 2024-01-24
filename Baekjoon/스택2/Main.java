import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

class answer_stack{
    Stack<Integer> stack;
    StringBuilder answer = new StringBuilder();
    answer_stack(){
        stack = new Stack<>();
    }
    void command(final int command_num, final int insert_value){
        
        switch (command_num) {
            case 1:
                stack.push(insert_value);
                break;
            case 2:
                if (stack.size()!=0){
                    //System.out.println(stack.pop());
                    answer.append(String.format("%d%n",stack.pop()));
                }
                else{answer.append(String.format("%d%n",-1));}
                break;
        
            case 3:
                //System.out.println(stack.size());
                answer.append(String.format("%d%n",stack.size()));
                break;
            case 4:
                if (stack.size()==0){
                    //System.out.println(1);
                    answer.append(String.format("%d%n",1));
                }
                else answer.append(String.format("%d%n",0));
                break;
            case 5:
                if (stack.size()!=0){
                    //System.out.println(stack.get(stack.size()-1));
                    answer.append(String.format("%d%n",stack.get(stack.size()-1)));
                }
                else{answer.append(String.format("%d%n",-1));}
                break;
        
            default:
                break;
        }
    }


}


class Main{

    
    public static void main(String[] args)throws IOException{
        Scanner scin = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder answer = new StringBuilder();
        int Tcase = scin.nextInt();
        answer_stack st = new answer_stack();
        
        while(Tcase-->0){
            int firstcnum = scin.nextInt();
            if (firstcnum == 1){
                st.command(firstcnum, scin.nextInt());
            }
            else st.command(firstcnum, 0 );
        }
        bw.write(String.format("%s",st.answer));
        bw.flush();
        scin.close();
    }
}