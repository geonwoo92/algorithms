package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MerberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     MemberModel mm = new MemberModel();

     Scanner scanner = new Scanner(System.in);
     System.out.println("ID");
     String identification = scanner.next();
     mm.setIdentification(identification);

     System.out.println("비번");
     String password = scanner.next();
     mm.setPassword(password);

     System.out.println("비번확인");
     String verify_password = scanner.next();
     mm.setVerify_password(verify_password);

     System.out.println("이름");
     String name = scanner.next();
     mm.setName(name);

     System.out.println("주민번호");
     String social_Security_Number = scanner.next();
     mm.setSocial_Security_Number(social_Security_Number);

     System.out.println("전화번호");
     String phone_number = scanner.next();
     mm.setPhone_number(phone_number);

     System.out.println("주소");
     String address = scanner.next();
     mm.setAddress(address);

     System.out.println("ID: " + mm.getIdentification() );
     System.out.println("비번: "+ mm.getPassword());
     System.out.println("비번확인: "+ mm.getVerify_password());
     System.out.println("이름: "+ mm.getName());
     System.out.println("주민번호: "+ mm.getSocial_Security_Number());
     System.out.println("전화번호: "+ mm.getPhone_number());
     System.out.println("주소: "+ mm.getAddress());


    }
}