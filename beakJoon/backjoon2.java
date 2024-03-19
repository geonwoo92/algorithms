package beakJoon;

import java.util.Scanner;

public class backjoon2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                String[] s = scanner.next().split(",");
                int A = Integer.parseInt(s[0]);
                int B = Integer.parseInt(s[1]);
                System.out.println(A + B);
            }
        }

}
