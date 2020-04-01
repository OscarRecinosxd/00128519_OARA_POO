package com.OARA.x00128519;

public class Ammo extends ReusableItem{
    private boolean equipped;

    public Ammo(String name, int weight, String description, int remainingUses, boolean equipped) {
        super(name, weight, description, remainingUses);
        this.equipped = equipped;
    }

    public boolean equip(){
    return equipped;

    }

    @Override
    public String toString() {
        return "Ammo{" +
                "equipped=" + equipped +
                ", remainingUses=" + remainingUses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", description='" + description + '\'' +
                '}';
    }
}
