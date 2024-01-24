// 객체지향으로 풀었지만... 시간초과


import java.util.*;
import java.io.*;


class Word implements Comparable<Word>{
    String word;
    int frequency;

    Word(){}
    Word(String word, int frequency){
        this.word = word;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Word o) {
        if (Integer.compare(this.frequency,o.frequency) != 0){
            return o.frequency - this.frequency;
        }

        if (this.word.length() != o.word.length()){
            return o.word.length() - this.word.length();    
        }

        else{
            return o.word.compareTo(this.word);
        }
    }

    @Override
    public String toString() {
        return this.word;
    }

    @Override                                                 //같은 단어 스트링을 가지고있는 단어객체는 같도록 판별하도록하는 오버라이딩
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word w = (Word) o;
        return Objects.equals(this.word, w.word);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(word);
    }
}

class Main2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Word> word_Set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wordCnt = Integer.parseInt(st.nextToken());
        int limitLen = Integer.parseInt(st.nextToken());

        while (wordCnt-->0){                                  // 단어의 길이가 limitLen 미만인 단어들을 제외하고 word_Set에 추가한다.
            
            Word word = new Word(br.readLine(),word.frequency);
            
            if (word_Set.contains(word)){
                word.frequency += 1;
                word_Set.remove(word);
                word_Set.add(word);
            }
            if (!(word.word.length() < limitLen)){
                word_Set.add(word);
                word.frequency += 1;
            }



        }
        
        ArrayList<Word> wordList = new ArrayList<>(word_Set);

        Collections.sort(wordList);

        for (Word w : wordList){
            System.out.println(w.frequency);
            sb.append(w.word + "\n");
        }
        
        System.out.println(sb);


    }
}