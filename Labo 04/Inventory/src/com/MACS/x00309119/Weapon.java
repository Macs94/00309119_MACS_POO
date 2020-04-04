package com.MACS.x00309119;

public class Weapon extends ReusableItem {
private String type, wieldType;
private double speed,damage;
private int level;

    public Weapon(int remainingUses, String type, String wieldType, double speed, double damage, int level) {
        super(remainingUses);
        this.type = type;
        this.wieldType = wieldType;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
    }

    public Weapon(int weight, String name, String description, int remainingUses,
                  String type, String wieldType, double speed, double damage, int level) {
        super(weight, name, description, remainingUses);
        this.type = type;
        this.wieldType = wieldType;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
    }
    public void upgrade(int level,double speed,double damage){
        //mejorar el arma dentro de toso sus parámetros enteros.(la función no recibe parámetros en el diagrama pero
        // solo de esa manera se me ocurrió para mejorar)
        level++;
        speed+=3;
        damage+=10;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", wieldType='" + wieldType + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                ", level=" + level +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
