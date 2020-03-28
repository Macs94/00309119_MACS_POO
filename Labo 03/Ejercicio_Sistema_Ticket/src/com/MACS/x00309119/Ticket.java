package com.MACS.x00309119;

import javax.swing.*;

public class Ticket {
    private Automovil auto;
    private RegistroTiempo tiempo;

    public Ticket (String placas,int entrada){
        auto = new Automovil(placas);
        tiempo = new RegistroTiempo(entrada);
    }

    public void Salir(){
        int salida;
        salida = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tiempo de salida:"));
        if(salida<tiempo.getEntrada())
            JOptionPane.showMessageDialog(null,"No puedes viajar en el tiempo!!!");
        else
            tiempo.setSalida(salida);
            JOptionPane.showMessageDialog(null,"Debe pagar: "+tiempo.calcularMonto());
            if(tiempo.calcularMonto()>0)
                Moneda.PagarMonto(tiempo.calcularMonto());

    }

    public String getPlaca() {
        return auto.getPlacas();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "auto=" + auto.getPlacas() +
                ", tiempo=" + tiempo.getEntrada() +
                '}';
    }
}
