import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException{

        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b < a; b++) {
                for (int c = b+1; c <= a; c++) {
                    for (int d = c+1; d <= a; d++) {
                        if (Math.pow(a, 3) == Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3)) {
                            System.out.println("Cube = "+ a + ", Triple = (" + b + ","+ c +"," + d + ")");
                        }
                    }
                }
            }
        }
    }
}