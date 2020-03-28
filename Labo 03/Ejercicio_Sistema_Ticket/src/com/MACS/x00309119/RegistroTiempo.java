package com.MACS.x00309119;

public class RegistroTiempo {
    private int entrada;
    private int salida;

    public RegistroTiempo(int entrada) {
        this.entrada = entrada;
        this.salida = 0;
    }

    public int getEntrada() {
        return entrada;
    }

    public double calcularMonto(){
        int duracion = salida - entrada;
        if(duracion>=30)
            return 0.50;
        else if(duracion > 100)
            return 1.00;
        else if(duracion >=200)
            return 5.00;
        else return 0.00;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }
}
