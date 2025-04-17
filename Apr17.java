import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Apr17 { // 11652 ** 미완
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] num1 = new long[num];
        for (int i = 0; i < num; i++) {
            num1[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(num1);
        int[] counts = new int[num];
        counts[0] = 1;
        int maxCount = 1;
        long minNum = num1[0];
        for (int i = 1; i < num; i++) {
            counts[i] = 1;
            if(num1[i] == num1[i-1]) {
                counts[i] = counts[i-1]+1;
            }else{
                if(counts[i]>maxCount){
                    maxCount = counts[i];
                    minNum = num1[i];
                }
            }
        }
        System.out.println(minNum);
    }

}
