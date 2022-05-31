package Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15656 {
    static int N,M;
    static int [] num;
    static int [] answer;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

        num  = new int[N];
        answer = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i<N;i++){
            num[i]= Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        backTracking(0);

        System.out.println(sb);


    }

    private static void backTracking(int depth){

        if(depth ==M){
            for(int i = 0; i<M;i++){
                sb.append(answer[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<N;i++){
           answer[depth]=num[i];

            backTracking(depth+1);
        }
    }
}
