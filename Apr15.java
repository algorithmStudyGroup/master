import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Apr15 { // 11650
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i][0] = Integer.parseInt(str.split(" ")[0]);
            arr[i][1] = Integer.parseInt(str.split(" ")[1]);
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
// 람다식을 이용하여 정렬하기
// Arrays.sort(정렬할 배열, 정렬 기준)의 정렬 기준을 Comparator로 구현한다.
// Comparator 인자 두 개를 받아서 인자1-인자2를 비교해 오름차순으로 두 인자를 정렬해 반환

