package com.OARA.x00128519;

abstract class HealthItem extends Item{
    protected int reuseTime;
    protected String level;
    protected String type;

    public HealthItem(String name, int weight, String description, int reuseTime, String level, String type) {
        super(name, weight, description);
        this.reuseTime = reuseTime;
        this.level = level;
        this.type = type;
    }

    public abstract void drink();




}
