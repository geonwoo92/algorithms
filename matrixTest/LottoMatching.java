package matrixTest;

/**
 * 로또 발급은 같다,
 * 추가된 로직은 추첨된 로또이다
 * 두 로또의 일치여부에 따라
 * 다음과 같은 메시지를 출력한다
 * 단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
 * <p>
 * 1~8
 * 1등 - 6개 맞춤
 * 2등 - 5개
 * 3등 - 4개
 * 4등 - 3개
 * 꽝 -2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        int[][] mtx = new int[2][];
        int k = 0;
        for (int i = 0; i < 2; i++) {
            mtx[i] = randomLottoNumber();
            arrSort(mtx[i]);
        }
        System.out.printf("로또번호: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if(mtx[i] == mtx[i]){

                }
                System.out.printf("%d " ,mtx[i][j]);

            }


            System.out.println();
        }



    }

    private static int[] randomLottoNumber() {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 8);
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    check = true;
                }
                if (check == true) {
                    i--;
                }
            }
        }
        return arr;
    }

    private static void arrSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

