package com.MACS.x00309119;

import javax.swing.*;

public class Moneda {
    private static double nickel = 0.05, dime = 0.10, quarter = 0.25, dollar = 1.00;


    private Moneda(){
    }
    public static void PagarMonto(double calcularMonto){
        double monedasIns;
        int op2, contador;
        do{
            op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1)0.05USD\n2)0.10USD\n3)0.25USD\n4)1.00USD"));
            contador = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas monedas de este tipo:"));
            switch(op2){
                case 1:
                    monedasIns = contador * nickel;
                    break;
                case 2:
                    monedasIns = contador * dime;
                    break;
                case 3:
                    monedasIns = contador * quarter;
                    break;
                case 4:
                    monedasIns = contador * dollar;
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + op2);
            }

        }while(monedasIns < calcularMonto);
        double cambio = monedasIns - calcularMonto;
        JOptionPane.showMessageDialog(null,"Su pago ha sido efectuado.\nSu cambio es de "+cambio+"USD");


    }


}
