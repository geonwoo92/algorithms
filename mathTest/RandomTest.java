package mathTest;

import java.util.function.DoubleFunction;

public class RandomTest {
    static int returnRandomNumber() {
        int randomNumber = (int)(Math.random()*100);
        System.out.printf("랜덤값: %d",randomNumber);
        return randomNumber;
    }

public static void main(String[] args) {
    int randomNumber = returnRandomNumber ();
    System.out.println(" 리턴된 값: "+randomNumber);

}
}
