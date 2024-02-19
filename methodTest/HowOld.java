package methodTest;

import java.util.Scanner;

public class HowOld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String age = String.valueOf(inputAge(sc));
        System.out.println(" 나이:"+age);

    }

    static int inputAge(Scanner sc) {
        System.out.println("나이: ");
        return sc.nextInt();

    }
}
