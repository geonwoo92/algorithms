package kaupOOP;


import memberOOP.MemberModel;

import java.util.Scanner;

// 카우프지수 구하는 프로그램을 객체지향으로 작성해 주세요.
public class KaupView {
    static String test;
    static double returnRandomTall(){
        return Math.random()*50+150;
    }
    static double returnRandomWeight(){
        return Math.random()*70+30;
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            MemberModel person = new MemberModel(returnRandomTall(),returnRandomWeight());

            KaupService service = new KaupServiceImpl();
            double bmi = service.createBMI();
            String bodyMass = service.createBodyMass();

            System.out.println("===BMI 계산기====");
            System.out.println("이름: " + person.getName());
            System.out.println("몸무게: " + person.getWeight());
            System.out.println("키: " + person.getHeight());
            System.out.println("BMI: " + bmi);
            System.out.println("BodyMass: " + bodyMass);


            }
        }
    }
