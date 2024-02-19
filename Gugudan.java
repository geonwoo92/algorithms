import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 구구단을 출력하시오 ");

        int n = sc.nextInt();

        for(int i = 1 ; i < 10; i++){
            System.out.println( n  + "* " + i + " = " + n * i );
        }
    }
}
