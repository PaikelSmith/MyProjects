package Scheme;

public class Scheme {
    public static void main(String[] args) {
        int f1;
        int f2;
        for (int x1 = 0; x1 <=1; x1++) {
            for (int x2 = 0; x2 <=1; x2++) {
                for (int x3 = 0; x3 <=1; x3++) {
                    for (int x4 = 0; x4 <=1; x4++) {
                        if (x1 + 1 - x2 + x3 == 2) {
                            f1 = 1;
                        }
                        else {
                            f1 = 0;
                        }


                        if (x1 + 1 - x2 + x3 == 1) {
                            f2 = 1;
                        }
                        else {
                            f2 = 0;
                        }
                        int f3 = x1 * (1 - x2) * x3 + (1 - x1) * x2 * (1 - x3);
                        int g1 = x4 + f1 - x4 * f1;
                        int g2 = x4 + f2 - x4 * f2;
                        int g3 = x4 + f3 - x4 * f3;
                        int r = f1 + g3 - 2 * f1 * g3;
                        int s = f2 + g1 - 2 * f2 * g1;
                        int t = f3 + g2 - 2 * f3 * g2;
                        System.out.print(x1);
                        System.out.print(x2);
                        System.out.print(x3);
                        System.out.print(x4);
                        System.out.print(" ");
                        System.out.println(r + " " + s + " " + t);
                    }
                }
            }
        }
    }
}
