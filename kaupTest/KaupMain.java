package kaupTest;

public class KaupMain {

    // 카우프지수 구하는 프로그램을 작성해 주세요.
    //키는 150~200, 몸무게는 30~99 제한 랜덤으로 뽑기 둘다 실수(double)
    //고도 비만 : 39 이상
    //중(重)도 비만 (2단계 비만) : 32 - 38.9
    //경도 비만 (1단계 비만) :30 -36.9
    //과체중 : 24- 29.9
    //정상 : 10 - 23.9
    //저체중 : 10 미만
    static double rangedRandom(double star, double range) {
        return Math.random() * range + star;
    }
    public static void main(String[] args) {
        double weight = rangedRandom(30, 70);
        double height = rangedRandom(1.5, 0.5);
        double BMI = weight / (height * height);

        System.out.printf("weight:%.1f height:%.1f BMI:%.1f", weight, height, BMI);
        if (BMI >= 39) {
            System.out.printf("\n BMI 수치 %.1f 로 고도비만입니다 ", BMI);
        } else if (BMI >= 30) {
            System.out.printf("\n BMI수치 %.1f 로 중도비만입니다", BMI);
        } else if (BMI >=24) {
            System.out.printf("\n BMI수치 %.1f 로 과체중입니다", BMI);
        } else if(BMI >= 10){
            System.out.printf("\n BMI수치 %.1f로 정상 체중입니다", BMI);
        } else {
            System.out.printf("\n BMI수치 %.1f로 저체중입니다", BMI);
        }
    }
}
