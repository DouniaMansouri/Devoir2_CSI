import java.util.*;

public class FibMain {
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
        System.out.println(Arrays.toString(f.sequence));
    }
    catch(Exception e) {
        System.out.println("usage: java Fib NUMBER");
    }

        
    }

}