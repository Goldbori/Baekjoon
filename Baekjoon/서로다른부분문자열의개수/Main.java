import java.util.*;



class Main{
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        String myString = scin.nextLine();
        //ArrayList<String> my_list = new ArrayList<>();
        HashSet<String> my_Set = new HashSet<>();
        for (int i = 0; i < myString.length() ; i++){
            for (int j = i + 1 ; j < myString.length()+1; j++){
                my_Set.add(myString.substring(i,j));
            }
        }
       
        System.out.println(my_Set.size());
        System.out.println();
    }
}