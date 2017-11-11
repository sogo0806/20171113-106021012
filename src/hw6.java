import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String st = sca.nextLine();
        int n = sca.nextInt();
        for (int i = 0;i<st.length();i++){
            int word = st.charAt(i)+n;
            System.out.print((char)word);
        }
    }
}
