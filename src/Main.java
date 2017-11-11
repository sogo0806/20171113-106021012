import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();
        int sum = 0;
        if (a<=b){
            for (int i = a; i<=b; i++){
                if (i%c==0){
                    sum = sum +i;
                }
            }
            System.out.println(sum);
        }
    }
}
