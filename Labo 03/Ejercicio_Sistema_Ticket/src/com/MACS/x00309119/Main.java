package com.MACS.x00309119;
import javax.swing.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	ArrayList<Ticket> tickets = new ArrayList<>();
	int op1 = 0;
	String placas="";
	do{
	    op1 = Integer.parseInt(JOptionPane.showInputDialog(null, MainMenu()));
	    switch(op1){
            case 1:
                tickets.add(agregarTicket());
                break;
            case 2:
                if(tickets.isEmpty())
                    JOptionPane.showMessageDialog(null,"No hay tickets!");
                else
                    placas = JOptionPane.showInputDialog(null, "Qué placa desea buscar?: ");
                    for (int i = 0; i < tickets.size(); i++) {
                        if (tickets.get(i).getPlaca().equalsIgnoreCase(placas)){
                                tickets.get(i).Salir();
                                tickets.remove(i);}
                        else
                            JOptionPane.showMessageDialog(null, "No se encontro el auto.");

                    }
                    break;
            case 3:
                if(tickets.isEmpty())
                    JOptionPane.showMessageDialog(null,"No hay tickets!");
                else
                    placas = JOptionPane.showInputDialog(null, "Qué placa desea buscar?: ");
                for (int i = 0; i < tickets.size(); i++) {
                    if (tickets.get(i).getPlaca().equalsIgnoreCase(placas))
                    JOptionPane.showMessageDialog(null, tickets.get(i).toString());
                    else
                        JOptionPane.showMessageDialog(null,"No se encontro el auto.");

                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Saliendo...");
                break;



        }

    }while(op1 != 0);

    }
   public  static String MainMenu(){
        return "1.Agregar Autommovil\n2.Salir del parqueo\n3.Consultar ticket\n0.Salir";

    }
    public static Ticket agregarTicket(){
        int entrada;
        String placas;
        placas = JOptionPane.showInputDialog(null,"Digite las placas del auto: ");
        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tiempo de entrada (formato militar): "));
        return new Ticket(placas,entrada);


    }

}
