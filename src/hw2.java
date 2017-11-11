import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int sum = 1;
        for (int i = 1;i<=n;i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
