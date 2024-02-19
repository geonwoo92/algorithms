import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 다음 시엄에서 두개 반의 평균 점수를 구하시오");

        System.out.println(" 1반 시험에 응시한 학생수는 몇명입니까 ? ");
        int numberOfstduent = sc.nextInt();

        System.out.println(" 2반 시험에 응시한 학생수는 몇명입니까 ? ");
        int numberOfstduent2 = sc.nextInt();

        int[] scores = new int[numberOfstduent];

        int avg = 0;
        ;
        for (int i = 0; i < scores.length; i++) {
            System.out.println(" 점수를 입력하시오: ");
            scores[i] = sc.nextInt();

            avg += scores[i];

        }


        avg = avg / scores.length;

        System.out.println(" 1반의 평균 점수" + avg + "이다");
        System.out.println(" 2반의 평균 점수" + avg + "이다");
    }
}

