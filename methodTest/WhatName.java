package methodTest;

import java.util.Scanner;

public class WhatName {
    static String returname(String lastname){
        return "제임스" +" "+ lastname;

    }
    public static void main(String[] args) {
        String lastname = "감마";
        String name = returname(lastname);
        System.out.println("이름 : " + name);
    }

    public static String inputName2(Scanner sc) {
        return sc.next();
    }
}
