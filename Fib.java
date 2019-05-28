import java.util.*;

public class Fib extends Thread
{
    private int x;
    public int answer;

    public Fib(int x) {
        this.x = x;
    }

    public void run() {
        try {
            ArrayList<Integer> sequence = new ArrayList<Integer>(x);
            for (int i = 0; i < x; i++){
                sequence.add((i-1) + (i-2));
            }
            /*Fib f1 = new Fib(x-1);
            Fib f2 = new Fib(x-2);
            f1.start();
            f2.start();
            f1.join();
            f2.join();
            answer = f1.answer + f2.answer;*/
        }
           catch(InterruptedException ex) { }
        
    }

    public static void main(String[] args)
        throws Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many fibonacci numbers would you like to print?");
            int arg = sc.nextInt();

            
            Fib f = new Fib(arg);
            f.start();
            f.join();
 
        
        }
        catch(Exception e) {
            System.out.println("usage: java Fib NUMBER");
        }
    }
}