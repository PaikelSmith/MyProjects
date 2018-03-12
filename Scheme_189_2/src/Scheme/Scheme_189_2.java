package Scheme;

public class Scheme_189_2 {
    public static void main(String[] args) {
        int f1;
        int f2;
        for (int x1 = 0; x1 <=1; x1++) {
            for (int x2 = 0; x2 <=1; x2++) {
                for (int x3 = 0; x3 <=1; x3++) {
                    for (int x4 = 0; x4 <=1; x4++) {
                        if (x1 + 1 - x2 + x3 == 1) {
                            f1 = 1;
                        }
                        else {
                            f1 = 0;
                        }
                        if (x1 + 1 - x2 + x3 == 2) {
                            f2 = 1;
                        }
                        else {
                            f2 = 0;
                        }
                        int g1 = x4 * (1 - f1);
                        int g2 = x4 + f1 - x4 * f1;
                        int g3 = x4 * (1 - f2);
                        int g4 = x4 + f2 - x4 * f2;
                        int r = 0;
                        int s = 1;
                        int t = 0;
                        if (g2 == g3) {
                            r = 1;
                        }
                        if (f1 == g4) {
                            s = 0;
                        }
                        if (f2 == g1) {
                            t = 1;
                        }
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
