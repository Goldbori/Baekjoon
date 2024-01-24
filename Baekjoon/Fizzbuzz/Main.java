
interface FizzBuzz{
    void setNum(final int s,final int e);
}

class ConsoleBasedFizzBuzz implements FizzBuzz{
    int start;
    int end;
    @Override
    public void setNum(int s, int e) {
        
        for (int i = s ; i <e+1 ; i++) {
            
            if (i%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            
        }
    }
}


class Main{
    public static void main(String[] args) {
        ConsoleBasedFizzBuzz c = new ConsoleBasedFizzBuzz();
        c.setNum(1, 100);
    }
}