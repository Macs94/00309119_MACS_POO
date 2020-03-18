package com.MACS.X00309119;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String fraseO, fraseI = "";
        System.out.println("Escribe una frase para evaluar si es palindrome.");
        fraseO = in.nextLine();
        fraseO = fraseO.replaceAll(" ","");
        System.out.print(Palindrome(fraseO, fraseI));


    }

    static boolean Palindrome(String fraseO, String fraseI) {

        int tamaño = fraseO.length();

        for (int i = tamaño - 1; i >= 0; i--)
            fraseI = fraseI + fraseO.charAt(i);
        if (fraseO.equals(fraseI)) {
            System.out.println("La frase es palindrome.");

            return true;
        } else {
            System.out.println("La frase no es palindrome.");
            return false;
        }

    }
}




