package com.MACS.x00309119;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cuantos elementos deseas?");
        int n = in.nextInt();
        in.nextLine();
        int j = 1;
        Secuencia(n , j);


    }

    public static void Secuencia(int n, int j)
    {
        if(j<n)
        {
        System.out.print(j);
        Secuencia(n,j+1);
        }
        System.out.print(j);
    }
}
