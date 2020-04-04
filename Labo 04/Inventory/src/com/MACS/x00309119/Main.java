package com.MACS.x00309119;
import javax.swing.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Item> PersonalItems = new ArrayList<>();
        ArrayList<Item> CommonItems = new ArrayList<>();
        int op1 = 0,op2 = 0,op3 = 0;
        do{
            op1 = Integer.parseInt(JOptionPane.showInputDialog(null,MainMenu()));
            switch(op1){
                case 1:do{
                    op2 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu1()));
                    switch(op2){
                        case 1:
                            PersonalItems.add(AgregarPotion());
                            break;
                        case 2:
                            PersonalItems.add(AgregarElixir());
                            break;
                        case 3:
                            PersonalItems.add(AgregarAmmo());
                            break;
                        case 4:
                            PersonalItems.add(AgregarWeapon());
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null,"Regresando al menú principal");
                            break;
                    }

                }while(op2!=0);
                break;
                case 2:
                    final int id1;
                    id1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el ID del item"));
                    PersonalItems.forEach(obj->{
                        //se muestra un mensaje de no encontrar item cada vez que cambia el id de un paso hasta encontrarlo.
                        if(id1 == obj.id)
                        {
                            JOptionPane.showMessageDialog(null,"Copiando item. . .");
                            CommonItems.add(obj);
                        }
                        else
                            JOptionPane.showMessageDialog(null,"No se encontró el item");
                    });
                    break;
                case 3:do{
                    op3 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu2()));
                    switch(op3){
                        case 1:
                            final int id2;
                            id2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el ID del item"));
                            PersonalItems.forEach(obj->{
                                if(id2==obj.id)
                                    JOptionPane.showMessageDialog(null,obj.toString());
                                else
                                    JOptionPane.showMessageDialog(null,"No se encontró el item");
                            });
                            break;

                        case 2:
                            final int id3;
                            id3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el ID del item"));
                            CommonItems.forEach(obj->{
                                if(id3==obj.id)
                                    JOptionPane.showMessageDialog(null,obj.toString());
                                else
                                    JOptionPane.showMessageDialog(null,"No se encontró el item");
                            });
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null,"Regresando al menú");
                            break;
                    }

                }while(op3!=0);
                break;
                case 4:
                    do{
                    op3 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu2()));
                    switch(op3){
                        case 1: do{
                            op2 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu1()));
                            switch(op2){
                                case 1:
                                    PersonalItems.forEach(obj->{
                                        if(obj instanceof Potion)
                                            //Se abre una ventana por cada item dentro de la lista,tratar de modificar ulteriormente.
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 2:
                                    PersonalItems.forEach(obj->{
                                    if(obj instanceof Elixir)
                                        JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 3:
                                    PersonalItems.forEach(obj->{
                                        if(obj instanceof Ammo)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 4:
                                    PersonalItems.forEach(obj->{
                                        if(obj instanceof Weapon)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                            }

                        }while(op2!=0);
                        break;
                        case 2: do{
                            op2 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu1()));
                            switch(op2){
                                case 1:
                                    CommonItems.forEach(obj->{
                                        if(obj instanceof Potion)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 2:
                                    CommonItems.forEach(obj->{
                                        if(obj instanceof Elixir)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 3:
                                    CommonItems.forEach(obj->{
                                        if(obj instanceof Ammo)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                                case 4:
                                    CommonItems.forEach(obj->{
                                        if(obj instanceof Weapon)
                                            JOptionPane.showMessageDialog(null,obj.toString());
                                    });
                                    break;
                            }
                        }while(op2!=0);
                        break;
                        }
                    }while(op3!=0);
                    break;
                case 5:do{
                    op3 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu2()));
                    switch(op3){
                        case 1:
                            final int id2;
                            id2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el ID del item"));
                            PersonalItems.removeIf(obj->obj.id == id2);
                            JOptionPane.showMessageDialog(null,"Item borrado. . .");
                            break;

                        case 2:
                            final int id3;
                            id3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el ID del item"));
                            CommonItems.removeIf(obj->obj.id == id3);
                            JOptionPane.showMessageDialog(null,"Item borrado. . .");
                            break;
                        case 0:
                            JOptionPane.showMessageDialog(null,"Regresando al menú");
                            break;
                    }
                }while(op3!=0);
                break;
                case 6:
                    do{
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu2()));
                        switch(op3){
                            case 1: do{
                                op2 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu1()));
                                switch(op2){
                                    case 1:
                                        PersonalItems.removeIf(obj-> obj instanceof Potion);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 2:
                                        PersonalItems.removeIf(obj-> obj instanceof Elixir);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 3:
                                        PersonalItems.removeIf(obj-> obj instanceof Ammo);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 4:
                                        PersonalItems.removeIf(obj-> obj instanceof Weapon);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                }

                            }while(op2!=0);
                                break;
                            case 2: do{
                                op2 = Integer.parseInt(JOptionPane.showInputDialog(null,SubMenu1()));
                                switch(op2){
                                    case 1:
                                        CommonItems.removeIf(obj-> obj instanceof Potion);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 2:
                                        CommonItems.removeIf(obj-> obj instanceof Elixir);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 3:
                                       CommonItems.removeIf(obj-> obj instanceof Ammo);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                    case 4:
                                        CommonItems.removeIf(obj-> obj instanceof Weapon);
                                        JOptionPane.showMessageDialog(null,"Item borrado. . .");
                                        break;
                                }

                            }while(op2!=0);
                                break;
                        }
                    }while(op3!=0);
                    break;




            }

        }while(op1 != 0);


    }
    public  static String MainMenu(){
        return "1.Agregar Item\n2.Compartir Item\n3.Buscar Item por ID\n4.Buscar Item por tipo\n" +
                "5.Borrar Item por Id\n6.Borrar Item por Tipo\n0.Salir";
    }
    public  static String SubMenu1(){
        return "Elige el tipo del item\n1.Potion\n2.Elixir\n3.Ammo\n4.Weapons\n0.Salir";
    }
    public static String SubMenu2(){
        return "Elige la lista:\n1.Personal Items\n2.Common Items\n0.Salir";
    }
    public static Potion AgregarPotion(){
        int weight,amount,reuseTime;
        String name,description,level,type;
        weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el peso de la poción:"));
        name = JOptionPane.showInputDialog(null,"Digita el nombre de la poción:");
        description = JOptionPane.showInputDialog(null,"Describe la poción: ");
        reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el cooldown:"));
        level = JOptionPane.showInputDialog(null,"Digita el nivel de la poción:");
        type = JOptionPane.showInputDialog(null,"Digita el tipo de poción(Mana/Vida):");
        amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el monto de pociones:"));
        return new Potion(weight,name,description,reuseTime,level,type,amount);
    }
    public static Elixir AgregarElixir(){
        int weight,amount,reuseTime,time;
        String name,description,level,type;
        weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el peso del elixir:"));
        name = JOptionPane.showInputDialog(null,"Digita el nombre del elixir:");
        description = JOptionPane.showInputDialog(null,"Describe el elixir: ");
        reuseTime = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el cooldown:"));
        level = JOptionPane.showInputDialog(null,"Digita el nivel del elixir:");
        type = JOptionPane.showInputDialog(null,"Digita el tipo de elixir(Mana/Vida):");
        amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el monto de elixirs:"));
        time = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el tiempo de curación: "));
        return new Elixir(weight,name,description,reuseTime,level,type,amount,time);
    }
    public static Ammo AgregarAmmo(){
        int weight,remainingUses;
        String name,description;
        boolean equipped = false;
        weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el peso del ammo:"));
        name = JOptionPane.showInputDialog(null,"Digita el nombre del ammo:");
        description = JOptionPane.showInputDialog(null,"Describe el ammo: ");
        remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el numero de usos:"));
        return new Ammo(weight,name,description,remainingUses,equipped);
    }
    public static Weapon AgregarWeapon(){
        int weight,remainingUses,level;
        String name,description,type,wieldType;
        double speed,damage;
        weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el peso del arma:"));
        name = JOptionPane.showInputDialog(null,"Digita el nombre del arma:");
        description = JOptionPane.showInputDialog(null,"Describe el arma: ");
        remainingUses = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el numero de usos:"));
        level = Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el nivel del arma:"));
        type = JOptionPane.showInputDialog(null,"Digita el tipo de arma:");
        speed = Double.parseDouble(JOptionPane.showInputDialog(null,"Digita la velocidad del arma:"));
        damage = Double.parseDouble(JOptionPane.showInputDialog(null,"Digita el daño del arma:"));
        wieldType = JOptionPane.showInputDialog(null,"Digita el wield type:");
        return new Weapon(weight,name,description,remainingUses,type,wieldType,speed,damage,level);
    }

}
