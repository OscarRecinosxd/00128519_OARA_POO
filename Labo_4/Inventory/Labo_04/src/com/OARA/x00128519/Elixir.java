package com.OARA.x00128519;

public class Elixir extends HealthItem{
    private int amount;
    private int time;

    public Elixir(String name,  String description, String level, String type,int reuseTime, int weight,int amount, int time) {
        super(name, weight, description, reuseTime, level, type);
        this.amount = amount;
        this.time = time;
    }

    @Override
    public void drink(){
        amount--;
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "amount=" + amount +
                ", time=" + time +
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
