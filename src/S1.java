public class S1 {
    //1. i가 0부터 2씩 증가하며 그 총합을 출력 , 2450
    public static void main(String[] args){
        int sum = 0, i = 0;

        while(i<100)
        {
            sum = sum + i;
            i += 2;
        }
        System.out.println(sum);
    }
}

class ForTest{
    public static void main(String[] args){
        int sum = 0, i;
        for (i=0 ; i<100 ; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
}

class DoWhileTest{
    public static void main(String[] args){
        int sum = 0, i = 0;
        do {
            sum += i;
            i += 2;
        } while (i<100);
        System.out.println(sum);
    }
}