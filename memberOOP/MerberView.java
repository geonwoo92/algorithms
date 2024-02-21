package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MerberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


     Scanner sc = new Scanner(System.in);

     System.out.println("ID,비번,비번확인,이름,주민번호,전화번호,주소를 입력해주세요");

     MemberModel mm = new MemberModel(sc.next(),sc.next(),sc.next(),sc.next(),
             sc.next(),sc.next(),sc.next());

     System.out.println(mm.toString());

    }


}