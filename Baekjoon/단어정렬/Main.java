    import java.util.*;


    class ComparatorByLength implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()){
                int target = 0;
                for (int i = 0 ; i < o1.length() ; i++){
                    if (o1.charAt(i) != o2.charAt(i)){target = i;break;}
                }
                
                return o1.charAt(target) - o2.charAt(target);
            }
            else return o1.length() - o2.length();
        }
    }

    class Main{
        public static void main(String[] args) {
            Scanner scin = new Scanner(System.in);
            int Tcase = scin.nextInt();
            ArrayList<String> list = new ArrayList<>();
            while (Tcase-->0){
                list.add(scin.next());
            }
            Set<String> set = new HashSet<>(list);
            ArrayList<String> newlist = new ArrayList<>(set);
            //System.out.println(newlist.toString());
            Collections.sort(newlist,new ComparatorByLength());
            //System.out.println("-------------------");
            for (int i = 0 ; i < newlist.size() ; i++){
                System.out.println(newlist.get(i));
            }
            scin.close();
        }
    }