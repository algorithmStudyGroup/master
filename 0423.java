
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] pp= new int[n];
        int[] ppi= new int[n];
        String[] input=(br.readLine().split(" "));
        for(int i=0;i<n;i++){
            pp[i]=Integer.parseInt(input[i]);
            ppi[i]=i;
        }
        int m= Integer.parseInt(br.readLine());

        String ans="";
        Integer[] indexObjects = Arrays.stream(ppi).boxed().toArray(Integer[]::new);
        Arrays.sort(indexObjects, (i1, i2) -> Integer.compare(pp[i2], pp[i1]));

        int[] p = new int[pp.length];
        int[] pi = new int[pp.length];
        for (int i = 0; i < pp.length; i++) {
            p[i] = pp[indexObjects[i]];
            pi[i] = indexObjects[i];
        }

        int min=n-1;
        int minn=n-2;
        if(n==1){
            System.out.println(0);
            return;
        }

        if(m==p[min]){
            System.out.println(pi[min]);
            return;
        }

        if(pi[min]==0){
            ans+=pi[minn];
            m-=p[minn];
        }else{
            ans+=pi[min];
            m-=p[min];
        }
        for(int i=0;i<50;i++){
            if(m-p[min]>=0){
                ans+=pi[min];
                m-=p[min];
            }else{
                break;
            }
        }


        for(int i=0;i<ans.length();i++){
            int maa=p[min];
            if(i==0 && pi[min]==0){
                maa=p[minn];
            }

            m+=maa;
            boolean flag=false;
            for(int j=n-1;j>=0;j--){
                if(m>=pp[j]){
                    m-=pp[j];
                    StringBuilder sb = new StringBuilder(ans);
                    sb.replace(i, i+1, j+"");  // 인덱스 2부터 4까지를 XYZ로 교체
                    ans=sb.toString();
                    flag=true;
                    break;
                }
            }
            if(!flag){
                m-=maa;
            }
        }
        System.out.println(ans);
   }
}


