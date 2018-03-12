package Task;

import com.sun.source.util.SourcePositions;

public class TaskB1 {
    public static void main(String[] args) {
        double pi = 0;
        int n = 5000;
        for (int k = 0; k <= n; k++) {
            pi += Math.pow(-1, k) / (2*k + 1);
        }
        System.out.println("Pi = " + 4*pi);
        System.out.println("Pi = " +Math.PI);

    }
}
