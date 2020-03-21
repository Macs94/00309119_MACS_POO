package com.MACS.x00309119;

public class herramientasMinecraft
{
    private String tipo, material;
    private int peso, daño, durabilidad;

    public herramientasMinecraft(String tipo, String material, int peso, int daño, int durabilidad)
    {
        this.tipo = tipo;
        this.material = material;
        this.peso = peso;
        this.daño = daño;
        this.durabilidad = durabilidad;
    }
    public void minarMat(int matHP)
    {
        if(durabilidad - matHP<0) {
            System.out.println("La herramienta "+ tipo +" de "+ material + " no tiene suficiente durabilidad para minar el material!!!");
        }
        else if(durabilidad - matHP == 0) {
            durabilidad -= matHP;
            System.out.println("La herramienta "+ tipo + " de "+ material + " se ha roto!!!");
        }
        else {
            durabilidad -= matHP;
            System.out.println("A la herramienta "+tipo+" de "+ material +" le quedan " + durabilidad + " puntos de durabilidad");
        }
    }
    public void repararHerra(int extraHP)
    {
        durabilidad += extraHP;
        System.out.println("La herramienta "+ tipo +" de "+ material+ " se ha reparado y se ha mejorado su durabilidad en "+extraHP+" puntos.");
    }

    @Override
    public String toString()
    {
        return "herramientasMinecraft{" +
                "tipo='" + tipo + '\'' +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                ", daño=" + daño +
                ", durabilidad=" + durabilidad +
                '}';
    }
    public String getTipo(){
        return tipo;
    }
    public String getMaterial(){
        return material;
    }
}
