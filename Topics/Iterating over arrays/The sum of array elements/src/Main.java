import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int counter = 0;
        for(int i = 1; i <= len; i++) {
            counter += sc.nextInt();
        }
        System.out.println(counter);
    }
}
