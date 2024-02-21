import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     Scanner scanner = new Scanner(System.in);
     System.out.println("ID");
     String identification = scanner.next();

     System.out.println("비번");
     String password = scanner.next();

     System.out.println("비번확인");
     String verify_password = scanner.next();

     System.out.println("이름");
     String name = scanner.next();

     System.out.println("주민번호");
     String Social_Security_Number = scanner.next();

     System.out.println("전화번호");
     String phone_number = scanner.next();

     System.out.println("주소");
     String address = scanner.next();

     System.out.println("ID: "+identification);
     System.out.println("비번: "+password);
     System.out.println("비번확인: "+verify_password);
     System.out.println("이름: "+name);
     System.out.println("주민번호: "+Social_Security_Number);
     System.out.println("전화번호: "+phone_number);
     System.out.println("주소: "+address);


    }
}