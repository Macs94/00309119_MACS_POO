package com.MACS.x00309119;
import java.util.Scanner;
public class Main
{
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args)
        {

                String texto;
                System.out.println("Escribe una cadena de texto:");
                texto = in.nextLine();
                System.out.println("Cambiando los caracteres 'a' a 'b'.");
                texto = texto.replaceAll("a","b");
                System.out.println("La cadena modificada es: "+ texto);




        }
}
