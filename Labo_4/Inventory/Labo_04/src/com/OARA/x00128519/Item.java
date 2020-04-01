package com.OARA.x00128519;

abstract class Item {
    protected int id;
    protected String name;
    protected int weight;
    protected String description;

    public Item() {
        name="";
        weight=0;
        description="";
    }

    public Item( String name, int weight, String description) {
        id=IdGenerator.newId();
        this.name = name;
        this.weight = weight;
        this.description = description;
    }



}
