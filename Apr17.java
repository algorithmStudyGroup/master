import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Apr17 { // 11652
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        int max = 0;
        long x = 0;
        for (int i = 0; i < num; i++) {
            Long key = Long.parseLong(br.readLine());
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
            if(map.get(key)>max){
                max = map.get(key);
                x = key;
            }else if(map.get(key)==max){
                if(x>key){
                    x = key;
                }
            }
        }
        System.out.println(x);
    }
}
// Math 클래스
//abs(): 절댓값 return
//max(): 더 큰 수 return
//min(): 더 작은 수 return
//round(): 소수점 첫째자리 반올림 return
//floor(): 소수점 버림 return
//ceil(): 소수점 올림
