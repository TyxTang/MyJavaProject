package HexadecimaltoOctal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            StringBuilder builder = new StringBuilder();
            for (int k = 0; k < line.length(); k++) {
                builder.append(hexToBin(line.substring(k, k + 1)));
            }
            String bin = format3(builder.toString());
            builder = new StringBuilder();
            for (int k = 0; k < bin.length(); k += 3) {
                builder.append(binToOct(bin.substring(k,k+3)));
            }
            String result = builder.toString();
            for (int k=0;k<result.length();k++){
                if(result.charAt(k) !='0'){
                    result = result.substring(k);
                    break;
                }
            }
            System.out.println(result);
        }
    }
    static String hexToBin(String hex) {
        return format4(Integer.toBinaryString(Integer.valueOf(hex, 16)));
    }
    static String binToOct(String bin) {
        return Integer.toOctalString(Integer.valueOf(bin, 2));
    }
    static String format3(String str) {
        if (str.length() % 3 == 2) {
            str = "0" + str;
        }
        if (str.length() % 3 == 1) {
            str = "00" + str;
        }
        return str;
    }
    static String format4(String str) {
        if (str.length() % 4 == 3) {
            str = "0" + str;
        }
        if (str.length() % 4 == 2) {
            str = "00" + str;
        }
        if (str.length() % 4 == 1) {
            str = "000" + str;
        }
        return str;
    }
}
