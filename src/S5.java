import java.util.Scanner;

public class S5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num[];
        num = new int [10];

        System.out.print("양의 정수 10개를 입력하시오>>");

        for(int i=0; i<10 ; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("3의 배수는 ");

        for(int i=0 ; i<10 ; i++){
            if(num[i] % 3 == 0)
                System.out.print(num[i] + " ");
        }

    }
}
