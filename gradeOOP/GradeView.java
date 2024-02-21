package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        GradeModel gm = new GradeModel();


        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름: ");
        String name = sc.next();
        gm.setName(name);

        gm.createKor();
        gm.createEng();
        gm.createMath();
        gm.createAvg();

        System.out.println("============= 성적표 ==============");
        System.out.println("이름 : " + gm.getName());
        System.out.println("국어점수 : " + gm.getKor());
        System.out.println("영어점수 : " + gm.getEng());
        System.out.println("수학점수 : " + gm.getMath());
        System.out.println("평균점수 : " + gm.getAvg());

    }
}