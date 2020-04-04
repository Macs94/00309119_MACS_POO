package com.MACS.x00309119;

abstract class Item {
    protected int id,weight;
    protected String name, description;

    public Item() {
    }

    public Item(int weight, String name, String description) {
        this.weight = weight;
        this.name = name;
        this.description = description;
        this.id = IdGenerator.newID();
    }

    public int getId() {
        return id;
    }
}
