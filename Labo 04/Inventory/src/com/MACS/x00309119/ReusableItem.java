package com.MACS.x00309119;

abstract class ReusableItem extends Item {
    protected int remainingUses;

    public ReusableItem(int weight, String name, String description, int remainingUses) {
        super(weight, name, description);
        this.remainingUses = remainingUses;
    }
    public ReusableItem(int remainingUses){
        this.remainingUses = remainingUses;
    }

    public void reduceUse(){
        remainingUses--;
    }
    public boolean use(){
        boolean attack=false;
        //usar random generated number para ver si el ataque fue realizado con exito y cambiar el valor de verdad de atack
        //se reduce el numero de usos independientemente si haya sido realizado con éxito el ataque
        reduceUse();
        return attack;
    }
}
