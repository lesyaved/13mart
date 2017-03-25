import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        double kek= 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i< n; i++) {
            arr[i] = sc.nextInt();
            kek+=arr[i];
        }
        System.out.print(kek/n);
    }
}