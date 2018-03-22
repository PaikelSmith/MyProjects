import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt (scan.nextLine ());
        double[][] matrix = new double[n][n];

        System.out.println (n);
        System.out.println("\t");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Double.parseDouble (scan.next ());
                BigDecimal bigDecimal = new BigDecimal(matrix[i][j]).setScale(0, RoundingMode.HALF_UP);
                System.out.print (bigDecimal.toString() + "\t");
            }
            System.out.println ("\n\t");
        }

    }
    }


