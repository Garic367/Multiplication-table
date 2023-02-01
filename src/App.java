import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr =new int[n][m];


        for(int i = 0; i <n; i++){
            for(int j = 0;j<m;j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}