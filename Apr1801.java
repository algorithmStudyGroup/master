import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Apr1801 { // 10814
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int age = Integer.parseInt(str.split(" ")[0]);
            String name = str.split(" ")[1];
            User user = new User(age, name);
            users[i] = user;
        }
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.age == o2.age) {
                    return 0;
                }else {
                    return o1.age - o2.age;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(User user : users) {
            sb.append(user.age).append(" ").append(user.name).append("\n");
        }
        System.out.println(sb);
    }
    static class User {
        int age = 0;
        String name = null;
        User(int age, String name) {
            this.age = age;
            this.name = name;
        }

    }
}