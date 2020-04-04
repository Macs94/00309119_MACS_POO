package com.MACS.x00309119;

public class Elixir extends HealthItem {
    private int amount,time;

    public Elixir(int weight, String name, String description, int reuseTime, String level, String type, int amount, int time) {
        super(weight, name, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    public Elixir(int reuseTime, String level, String type, int amount, int time) {
        super(reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    @Override
    public void drink() {
        //reducir el amount del elixir
        amount --;
        //afectar el HP curado en base al tiempo

    }

    @Override
    public String toString() {
        return "Elixir{" +
                ", id=" + id +
                "amount=" + amount +
                ", time=" + time +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
