package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class swea_1928 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static HashMap<Character, Integer> map = new HashMap<>();
    static String s, binaryS, stringSet, subString, result;
    static int t, decimal;
    static Character c;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 65), i);
        }
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 97), i + 26);
        }
        for (int i = 0; i < 10; i++) {
            map.put((char) (i + 48), i + 52);
        }
        map.put('+', 62);
        map.put('/', 63);

        t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            result = "";
            stringSet = "";
            s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                c = s.charAt(j);
                Integer integer = map.get(c);
                binaryS = Integer.toBinaryString(integer);

                while (binaryS.length() != 6) {
                    binaryS = "0" + binaryS;
                }
                stringSet += binaryS;
            }

            for (int j = 0; j < stringSet.length(); j += 8) {
                subString = stringSet.substring(j, j + 8);
                decimal = Integer.parseInt(subString, 2);
                result += (char) decimal;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
