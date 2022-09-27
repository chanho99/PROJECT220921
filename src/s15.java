import java.util.InputMismatchException;
import java.util.Scanner;

public class s15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("곱하고자 하는 두 수 입력>>");
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.print(a + "x" + b + "=" + a * b);
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
