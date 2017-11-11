import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int sum = 0;
        for (int i = 0;i<n;i++){
            int m = sca.nextInt();
            sum = sum + m ;
        }
        System.out.println(sum);
        System.out.println(sum/n);
    }
}
