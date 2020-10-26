package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int N, M;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        System.out.println( twoPointers() );

        br.close();
    }

    private static int twoPointers() {
        int sum = 0, count = 0;
        int left = 0, right = N - 1;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum <= M) {
                if (sum == M) count++;
                left++;
            } else if (sum > M) {
                right--;
            }
        }

        return count;
    }
}
