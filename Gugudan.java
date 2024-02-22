public class Gugudan {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {

                System.out.printf(" %3d * %d = %3d ", j, i, j * i);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");

        for (int i = 1; i < 10; i++) {

            for (int j = 6; j < 10; j++) {

                System.out.printf(" %3d * %d = %3d ", j, i, j * i);
            }
            System.out.printf("%n");
        }
    }
}
