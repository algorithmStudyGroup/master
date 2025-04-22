import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr2203 { // 11656
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] words = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            words[i] = s.substring(i);
        }
        Arrays.sort(words);
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }


}