package kaupTest;

public class KaupMain {

    // 카우프지수 구하는 프로그램을 작성해 주세요.
    //키는 150~200, 몸무게는 30~99 제한 랜덤으로 뽑기 둘다 실수(double)
    //초고도비만 : 150 이상
    //비만 : 99.1 이상
    //과체중 : 70.3 이상
    static double rangedRandom(double star, double range) {
        return Math.random() * range + star;
    }

    public static void main(String[] args) {
        double weight = rangedRandom(30, 70);

        double height = rangedRandom(1.5, 0.5);

        double BMI = weight / (height * height);

        System.out.printf("weight:%.1f height:%.1f BMI:%.1f", weight, height, BMI);
        if (BMI >= 70.3) {
            System.out.printf("\n BMI 수치 %.1f 로 과체중입니다 ", BMI);

        } else if (BMI >= 99.1) {
            System.out.printf("\n BMI수치 %.1f 로 비만입니다", BMI);

        } else if (BMI > 150) {
            System.out.printf("\n BMI수치 %.1f 로 초고도비만입니다", BMI);
        } else {
            System.out.printf("\n BMI수치 %.1f로 정상 체중입니다", BMI);

        }

    }
}
