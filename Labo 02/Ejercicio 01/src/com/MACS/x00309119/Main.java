package com.MACS.x00309119;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	ArrayList<herramientasMinecraft> herramientas = new ArrayList<>();
	String tipo, material;
	int daño,peso, durabilidad;
	byte op1 = 0, op2= 0,op3= 0;

	do{
	    MainMenu(); op1 = in.nextByte();in.nextLine();
	    switch(op1){

	        case 1:
                System.out.print("Tipo: "); tipo=in.nextLine();
                System.out.print("Material: ");material=in.nextLine();
                System.out.print("Daño: "); daño=in.nextInt();in.nextLine();
                System.out.print("Peso: "); peso=in.nextInt();in.nextLine();
                System.out.print("Durabilidad: "); durabilidad=in.nextInt();in.nextLine();

                herramientas.add(new herramientasMinecraft(tipo,material,daño,peso,durabilidad));
	            break;
            case 2:
                if(herramientas.isEmpty())
                    System.out.println("No hay herramientas en el inventario");
                else
                    herramientas.forEach(s->System.out.println(s.toString()));
                break;
            case 3:
                do{
                    SubMenu(); op2=in.nextByte();in.nextLine();
                    switch(op2) {
                        case 1:
                            System.out.print("Tipo: ");tipo = in.nextLine();
                            String finalTipo = tipo;
                            herramientas.forEach(s -> {
                                if (s.getTipo().equals(finalTipo)) System.out.println(s.toString());
                            });


                            break;

                        case 2:
                            System.out.print("Material: ");material = in.nextLine();
                            String finalMaterial = material;
                            herramientas.forEach(s -> {
                                if (s.getMaterial().equals(finalMaterial)) System.out.println(s.toString());
                            });
                            break;


                    }
                }while(op2!=0);
                break;
            case 4:
                System.out.print("Cuanto HP tiene el material a minar?");int matHP = in.nextInt();in.nextLine();
                herramientas.forEach(s->s.minarMat(matHP));
                break;
            case 5 :

                do {
                    SubSubMenu();op3 = in.nextByte();in.nextLine();
                    switch (op3) {
                        case 1:
                            herramientas.forEach(s -> s.repararHerra(50));
                            break;
                        case 2:
                            herramientas.forEach(s -> s.repararHerra(100));
                            break;
                    }
                }while(op3!=0);
        }
    }while (op1 != 0);
    }
    static public void MainMenu(){
        System.out.println("1.Agregar herramienta");
        System.out.println("2.Consultar todas las herramientas");
        System.out.println("3.Consultar herramientas");
        System.out.println("4.Minar material con las herramientas");
        System.out.println("5.Reparar herramientas");
        System.out.println("0.Salir");
        System.out.print("Su opción:");
    }
    static public void SubMenu(){
        System.out.println("1.Consultar por tipo");
        System.out.println("2.Consultar por material");
        System.out.println("0.Regresar");
        System.out.print("Su opcion: ");
    }
    static public void SubSubMenu(){
        System.out.println("Con que repair kit repararas las herramientas? ");
        System.out.println("1.Amateur (+50 durabilidad)");
        System.out.println("2.Expert (+100 durabilidad)");
        System.out.println("0.Cancelar.");
    }
}
