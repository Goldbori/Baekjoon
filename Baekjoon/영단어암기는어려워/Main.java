
//정답코드 

import java.util.*;

import java.io.*;

class Word_Comparator implements Comparator<String>{
    
    HashMap<String,Integer> map = Main.word_Set;
    @Override
    public int compare(String o1, String o2) {
        
        if ( Integer.compare(map.get(o1),map.get(o2)) != 0){
            return Integer.compare(map.get(o2),map.get(o1));
        }

        if (o1.length() != o2.length()){
            return o2.length() - o1.length(); 
        }

        else{
            return o1.compareTo(o2);
        }
    }
}


public class Main {
    static HashMap<String,Integer> word_Set;
    public static void main(String[] args) throws IOException{
        double beforeTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        word_Set = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wordCnt = Integer.parseInt(st.nextToken());
        int limitLen = Integer.parseInt(st.nextToken());

        while (wordCnt-->0){                                  // 단어의 길이가 limitLen 미만인 단어들을 제외하고 word_Set에 추가한다.
            String word = br.readLine();
            if (!(word.length() < limitLen)){
                word_Set.put(word,word_Set.getOrDefault(word, 0) + 1);
                
            }
        }
        br.close();
        //System.out.println(word_Set.keySet());
        //System.out.println(word_Set.values());
        ArrayList<String> list = new ArrayList<>(word_Set.keySet());
        Collections.sort(list,new Word_Comparator());
        
        for (String s : list){
            sb.append(s + "\n");
        }
        System.out.println(sb);

        double afterTime = System.currentTimeMillis();
        double secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
        System.out.println(word_Set.values());
    }
}
