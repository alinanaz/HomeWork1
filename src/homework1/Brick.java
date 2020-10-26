package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Brick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a, b, c");
        String Sa = br.readLine();
        String Sb = br.readLine();
        String Sc = br.readLine();
        int a = Integer.parseInt(Sa);
        int b = Integer.parseInt(Sb);
        int c = Integer.parseInt(Sc);
        System.out.println("Enter x, y");
        String Sx = br.readLine();
        String Sy = br.readLine();
        int x = Integer.parseInt(Sx);
        int y = Integer.parseInt(Sy);
        if (((x >= a) && (y >= b)) || ((x >= b) && (y >= a))
                || ((x >= b) && (y >= c)) || ((x >= c) && (y >= b))
                || ((x >= a) && (y >= c)) || ((x >= c) && (y >= a)))
            System.out.println("Allowed");
        else
            System.out.println("Not allowed");
    }
}
