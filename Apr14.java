import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apr14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2001]; // 중복되는 수 없음
        for(int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())+1000] = true;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append(i-1000).append("\n");
            }
        }
        System.out.println(sb);
        // 카운팅정렬
        // 데이터 배열의 max값에 따라 카운팅배열의 길이가 정해짐-> 수열의 길이보다 수의 범위가 극단적으로 크면 메모리 낭비
        // 데이터의 값이 몇 번 나왔는지(해당 값: index)를 세는 배열
        // counting 배열의 각 값은 데이터의 시작점-1
        // 안정적으로 정렬하기 위해서 데이터의 마지막 index부터 순회
    }
}
