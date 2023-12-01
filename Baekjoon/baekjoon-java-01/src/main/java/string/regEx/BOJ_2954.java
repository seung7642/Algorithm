package string.regEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2954 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("(?:([a|e|i|o|u]{1})(p{1})([a|e|i|o|u{1}]))", "$1");
        System.out.println(str);
    }
}
