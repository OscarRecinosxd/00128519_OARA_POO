package com.OARA.x00128519;

public class Potion extends HealthItem{
    private int amount;

    public Potion(String name, int weight, String description, int reuseTime, String level, String type, int amount) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
    }

    @Override
    public void drink(){
        amount--;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "amount=" + amount +
                ", reuseTime=" + reuseTime +
                ", level='" + level + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}

