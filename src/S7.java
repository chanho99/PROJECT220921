public class S7 {
    public static void main(String[] args){
        int num [] = new int[10];
        int sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for (int i = 0 ; i<10 ; i++){
            num[i] = (int)(Math.random()*10 + 1);
            System.out.print(num[i] + " ");
            sum += num[i];
        }

        double avg = sum / 10;

        System.out.print("\n평균은 " + avg);
    }
}
