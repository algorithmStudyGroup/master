
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input=(br.readLine().split(" "));
        int n=Integer.parseInt(input[0])+1,m=Integer.parseInt(input[1])+1;

        int k=Integer.parseInt(br.readLine());
        int[][] arr=new int[k][4];

        for(int i=0;i<k;i++){
            input=(br.readLine().split(" "));
            arr[i][0]=Integer.parseInt(input[0]);
            arr[i][1]=Integer.parseInt(input[1]);
            arr[i][2]=Integer.parseInt(input[2]);
            arr[i][3]=Integer.parseInt(input[3]);
        }
        long[][] dp=new long[n][m];
        dp[0][0]=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean f=true,ff=true;
                for(int l=0;l<k;l++){
                    if(arr[l][2]==i && arr[l][3]==j){
                        if(arr[l][0]==i-1 && arr[l][1]==j){
                            f=false;
                        }else if(arr[l][0]==i && arr[l][1]==j-1){
                            ff=false;
                        }
                    }else if(arr[l][0]==i && arr[l][1]==j){
                        if(arr[l][2]==i-1 && arr[l][3]==j){
                            f=false;
                        }else if(arr[l][2]==i && arr[l][3]==j-1){
                            ff=false;
                        }
                    }
                }
                if(j-1>=0 && ff)
                    dp[i][j]+=dp[i][j-1];
                if(i-1>=0 && f)
                    dp[i][j]+=dp[i-1][j];

            }
        }
        System.out.println(dp[n-1][m-1]);
   }
}
