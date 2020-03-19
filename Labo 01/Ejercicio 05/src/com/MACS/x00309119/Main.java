package com.MACS.x00309119;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<Character> vocales = new ArrayList<Character>();
        System.out.println("Cuantas letras vas a ingresar?");
        int n = in.nextInt();
        in.nextLine();
        int cont = 0;
        System.out.println("Ingresa las letras y se imprimiran las vocales ");
        while (n > cont)
        {
            char letra = in.next().charAt(0);
            cont++;
            if (letra == 'a' || letra == 'a' || letra == 'A' || letra == 'u' || letra == 'o' ||
                    letra == 'i' || letra == 'e' || letra == 'I' || letra == 'U' || letra == 'O' || letra == 'E')
            {
                vocales.add(letra);
            }

        }
        System.out.print("La lista de vocales es: " + vocales);
    }
}
