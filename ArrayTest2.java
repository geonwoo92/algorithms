import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * 최적화 문제 중 최대값 구하기
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력된 수 중에서 큰 수를 구하시오");
        int[] arr = {1,2,3};

        for (int i = 0; i < 2; i++) {
            System.out.println("자연수 입력 :");
            String num = sc.next();
            arr[i] = Integer.parseInt(num);
        }
        System.out.println("첫번째 수:" + arr[0]);
        System.out.println("두번째 수:" + arr[1]);

        if (arr[0] > arr[1]) {
            System.out.println(arr[0] + " 이 " + arr[1] + " 보다 크다 ");

        } else {
            System.out.println(arr[0] + " 이 " + arr[1] + " 보다 작다 ");
        }
        
    }
}