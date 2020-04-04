package com.MACS.x00309119;

abstract class HealthItem extends Item {
    protected int reuseTime;
    protected String level,type;

    public HealthItem(int weight, String name, String description, int reuseTime, String level, String type) {
        super(weight, name, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }
    public HealthItem(int reuseTime, String level,String type){
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public abstract void drink();



}
