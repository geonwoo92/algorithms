package kaupOOP;


import java.util.Scanner;

// 카우프지수 구하는 프로그램을 객체지향으로 작성해 주세요.
public class KaupView {
    static String test;
    public static void main(String[] args) {
        {
            Person person = new Person();

            Scanner sc = new Scanner(System.in);
            System.out.println("이름 :");
            String name = sc.next();
            person.setName(name);


            person.createHeight();
            person.createWeight();
            person.createBMI();
            person.createBodyMass();

            System.out.println("===BMI 계산기====");
            System.out.println("이름: " + person.getName());
            System.out.println("몸무게: " + person.getWeight());
            System.out.println("키: " + person.getHeight());
            System.out.println("BMI: " + person.getBmi());
            System.out.println("BodyMass: " + person.getBodyMass());


            }
        }
    }
