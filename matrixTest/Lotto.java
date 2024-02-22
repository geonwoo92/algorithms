package matrixTest;

//로또 프로그램
//서로 겹치지 않는 숫자 6개를 생성 0
//각 숫자는 1 ~ 45 범위 내의 숫자 0
//매번 실행 시 다른 숫자 출력
//오름차순 정렬
//-> 랜덤수 : Math 사용0
//결과)
//로또 번호
//2 11 25 27 35 38 20
public class Lotto {
    public static void main(String[] args) {

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 45);
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    check = true;
                }
            }
            if (check == true) {
                i--;
            }
            System.out.printf(" %d ", arr[i]);
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.printf(" 로또 번호 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" %d ", arr[i]);
        }


    }
}
