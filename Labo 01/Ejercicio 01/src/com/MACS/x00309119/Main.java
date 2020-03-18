package com.MACS.x00309119;

import java.util.Scanner;

public class Main{
    public static void main (String[]args){
        Scanner sca= new Scanner(System.in);
        int x = 0, y = 1;
        System.out.println("Cuantos elementos?");
        int n = sca.nextInt();sca.nextLine();
        System.out.println("Los primeros "+ n +" terminos son: ");
        for(int i = 1;i <= n;i++){
            int suma = 0;
            System.out.print(x + ";");
            suma =x + y;
            x = y;
            y = suma;

        }
    }
}

