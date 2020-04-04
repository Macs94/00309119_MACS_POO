package com.MACS.x00309119;

public class Potion extends HealthItem {
    private int amount;

    public Potion(int reuseTime, String level, String type, int amount) {
        super(reuseTime, level, type);
        this.amount = amount;
    }

    public Potion(int weight, String name, String description, int reuseTime, String level, String type, int amount) {
        super(weight, name, description, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public void drink() {
        //reducir el amount de la poción(work in progress)
        amount--;
    }

    @Override
    public String toString() {
        return "Potion{" +
                ", id=" + id +
                "amount=" + amount +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
