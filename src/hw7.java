import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String st = sca.nextLine();
        int sum = 0;
        for (int i = 0;i < st.length() ;i++){
            sum = sum + st.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
