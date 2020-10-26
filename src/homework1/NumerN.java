package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        String Sn = br.readLine();
        int n = Integer.parseInt(Sn);
        int powN = n * n;
        boolean if3InN;
        String poweredN = Integer.toString(powN);
        String three = "3";
        System.out.println(poweredN);
        if3InN = poweredN.contains(three);
        if (if3InN)
            System.out.println("Number 3 is in n^2");
        else
            System.out.println("Number 3 is not in n^2");
        System.out.println();
        int lengthN = Sn.length() - 1;
        char[] arrStr = Sn.toCharArray();
        System.out.println("Reversed string is: ");
        for (int i = lengthN; i >= 0; --i)
            System.out.print(arrStr[i]);
        System.out.println();
        System.out.println();
        char temp = arrStr[lengthN];
        arrStr[lengthN] = arrStr[0];
        arrStr[0] = temp;
        System.out.println("Replaced first and last symbol: ");
        System.out.println(arrStr);
        System.out.println();
        System.out.println(" Number starts and ends with 1: ");
        System.out.println('1' + Sn + '1');}}