package gittest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.*;

public class bj_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int len = Integer.parseInt(br.readLine());

        StringBuilder[] sb1 = new StringBuilder[201];
        for(int i = 0 ; i < 201 ; i++){
            sb1[i]=new StringBuilder();
        }

        for(int i = 0 ; i < len ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb1[age].append(age+" "+name).append("\n");

        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder val : sb1) {
            sb.append(val);
        }
        out.println(sb);


//

    }
}
