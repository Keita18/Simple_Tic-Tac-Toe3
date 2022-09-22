import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        int[] income = new int[leng];
        double maxTax = 0.0;
        int result = 0;

        for (int i = 0; i < leng; i++) {
            income[i] = sc.nextInt();
        }
        for (int i = 0; i < leng; i++) {
            double currentTax = (sc.nextInt() * income[i]) / 100.0;
            if (currentTax > maxTax ) {
                maxTax = currentTax;
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}