package com.learning.core.day2session1;

import java.util.Scanner;

public class ReplaceSpacesTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String str = sc.nextLine();
        ReplaceSpaces rs = new ReplaceSpaces();
        rs.replaceSpaces(str);

    }
}
