package com.OARA.x00128519;

public class Weapon extends ReusableItem{
    private String type;
    private String wieldType;
    private double speed;
    private double damage;
    private int level;

    public Weapon(String name, int weight, String description, int remainingUses, String type, String wieldType, double speed, double damage, int level) {
        super(name, weight, description, remainingUses);
        this.type = type;
        this.wieldType = wieldType;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
    }

    public void upgrade(){
        level++;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", wieldType='" + wieldType + '\'' +
                ", speed=" + speed +
                ", damage=" + damage +
                ", level=" + level +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
