import java.util.ArrayList;
import java.util.*;

class Main{

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1,3,2,4,5,4,6,6,7,7,8,9,9,4,5,6,6,4,5,6,4,2,2}));
        Collections.sort(list);
        System.out.println(list.toString());



    }
}