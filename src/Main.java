import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int n = sec.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sec.nextInt();
        }

        System.out.println(func(n, arr));
    }

    public static int func(int n, int[] arr){
        int m = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < m){
                m = arr[i];
            }
        }

        return m;
    }
}