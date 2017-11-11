import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int sum = 0;
        for (int i = 1; i<=n;i++ ){
            if (n%i==0){
                sum = sum+1;
            }
        }
        if (sum>2){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }
    }
}
