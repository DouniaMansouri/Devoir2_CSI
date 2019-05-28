import java.util.*;

public class Fib extends Thread
{
    private int x;
    public int[] sequence;

    public Fib(int x) {
        this.x = x;
    }

    public void run() {
        sequence = new int[x];
        for (int i = 0; i < x; i++){
            if (i == 0){
                sequence[i] = 0;
            }
            else if (i == 1){
                sequence[i] = 1;
            }
            else {
                sequence[i] = (sequence[i-1] + sequence[i-2]);
            } 
        }
    }
}