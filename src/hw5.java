import java.text.DecimalFormat;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float[] a = new float[10];
        for (int i = 0;i<10;i++){
            a[i]=sca.nextFloat();
        }
        float max = a[0];
        for (int i= 0;i<10;i++){
            if (a[i]>max){
                max = a[i];
            }
        }
        float min = a[0];
        for (int i = 0;i<10;i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println(df.format(max));
        System.out.println(df.format(min));
    }
}
