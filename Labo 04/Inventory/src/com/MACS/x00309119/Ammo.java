package com.MACS.x00309119;

public class Ammo extends ReusableItem{
    private boolean equipped;

    public Ammo(int remainingUses, boolean equipped) {
        super(remainingUses);
        this.equipped = equipped;
    }

    public Ammo(int weight, String name, String description, int remainingUses, boolean equipped) {
        super(weight, name, description, remainingUses);
        this.equipped = equipped;
    }
    public void equip(){
        equipped = true;
    }

    @Override
    public String toString() {
        return "Ammo{" +
                "equipped=" + equipped +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
