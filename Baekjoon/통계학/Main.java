import java.util.*;
import java.io.*;

class Main{
    static boolean eqeq = true;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> mid_list = new ArrayList<>();
        double valCnt = Double.parseDouble(br.readLine());
        double sum = 0;
        int max_val = -4000;
        int min_val = 4000;
        

        for (int i = 0 ; i < valCnt ; i++){
            int val = Integer.parseInt(br.readLine());
            if (val > max_val){
                max_val = val;
            }

            if (val < min_val){
                min_val = val;
            }
            mid_list.add(val);
            sum += val;
            map.put(val, map.getOrDefault(val, 0) + 1);

        }
        
        Collections.sort(mid_list);
        System.out.println(mid_list);
        ArrayList<Integer> val_list = new ArrayList<>(map.keySet());

        Collections.sort(val_list);
       
        double averagedouble = (sum/valCnt);
        String average = String.format("%d",Math.round(averagedouble));
        String midString = String.format("%d",mid_list.get(mid_list.size()/2));
        
        Collections.sort(val_list, new Comparator<Integer>() {             //빈도수 기준 정렬
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Integer.compare(map.get(o1), map.get(o2)) == 0){
                    Main.eqeq = false;
                    return o2 - o1;
                }
                return map.get(o1) - map.get(o2);
            }
        });

       
        HashSet<Integer> valueSet = new HashSet<>(map.values());
        System.out.println(map.values());
        System.out.println(valueSet);
        String mod;
        if (!(eqeq)){
            mod = String.format("%d",val_list.get(val_list.size() - 2));
            System.out.println("if");
        }
        else{
            Collections.sort(val_list, new Comparator<Integer>() {             //빈도수 기준 정렬
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o1) - map.get(o2);
                }
            });
            mod = String.format("%d",val_list.get(val_list.size() - 1));
        }


        
        String range = String.format("%d",max_val - min_val);

        StringBuilder sb = new StringBuilder();
        sb.append(average + "\n" + midString + "\n" + mod + "\n" + range);
        
        System.out.println(sb);

    }
}
