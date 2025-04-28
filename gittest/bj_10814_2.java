package gittest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_10814_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList> list = new ArrayList<>();
        int len = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < len ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            ArrayList<Object> list1 = new ArrayList<>();
            list1.add(age);
            list1.add(name);
            list.add(list1);
        }
        list.sort((a, b) -> Integer.compare((Integer) a.get(0), (Integer) b.get(0)));


        StringBuilder sb = new StringBuilder();
        for (ArrayList member : list) {
            sb.append(member.get(0)).append(" ").append(member.get(1)).append("\n");
        }
        System.out.print(sb);
    }
}
