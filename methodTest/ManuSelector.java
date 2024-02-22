package methodTest;

import java.util.Scanner;

public class ManuSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴 0.종료 1.생성 2.수정");
            String manu = sc.next();

            if (manu.equals("0")) {
                System.out.println(" 종료 ");
                return;
                
            }
        }
    }
}

