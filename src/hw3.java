import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int sum = 1;
        int sum2 = 1;
        int sum3 = 1;
        for (int i = 1;i<=n;i++){
            sum=sum*i;
            }
        for (int i = 1;i<=m;i++){
            sum2 = sum2*i;
        }
        for (int i = 1; i<=n-m;i++){
            sum3 = sum3*i;
        }
        System.out.println(sum/(sum2*sum3));
    }
}
