import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        long a = 2, b = 3;
        long sum = n==1 ? 1:2;
        for (int i = 3; i < n; i++) {
            sum=(a+b)% 10007;
            a=b% 10007;
            b=sum;
        }

        System.out.println( n==3 ? 3:sum % 10007);

    }
}