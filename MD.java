import java.util.Scanner;

public class MD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 다음 시엄에서 두개 반의 평균 점수를 구하시오");

        System.out.println(" 1반 시험에 응시한 학생수는 몇명입니까 ? ");
        int numberOfstduent = sc.nextInt();

        System.out.println(" 2반 시험에 응시한 학생수는 몇명입니까 ? ");
        int numberOfstduent2 = sc.nextInt();

        int[] scores = new int[numberOfstduent];
        int[] scores2 = new int[numberOfstduent2];


        int avg = 0;
        int avg2 = 0;
        for (int i = 0; i < scores.length; i++) {
            //System.out.println(" 점수를 입력하시오: ");
            scores[i] = (int) (Math.random() * 100);
            System.out.println(scores[i]);
            avg += scores[i];

        }
        for (int i = 0; i < scores2.length; i++) {
            //System.out.println(" 점수를 입력하시오: ");
            scores2[i] = (int) (Math.random() * 100);
            System.out.println(scores2[i]);
            avg2 += scores2[i];

        }
        System.out.println(" 1반의 평균 점수" + (avg / numberOfstduent) + "이다");
        System.out.println(" 2반의 평균 점수" + (avg2 / numberOfstduent2) + "이다");
    }
}

