package beakJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int sum = 0;


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        int fakeA = 0;
        int fakeB = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    fakeA = arr[i];
                    fakeB = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != fakeA && arr[i] != fakeB){
            System.out.println(arr[i]);}
        }

    }
}
