package com.OARA.x00128519;

abstract class ReusableItem extends Item{
    protected int remainingUses;


    public ReusableItem(String name, int weight, String description, int remainingUses) {
        super(name, weight, description);
        this.remainingUses = remainingUses;
    }

    public void reduceUse(){
        remainingUses--;
    }

    public boolean use(){
        return false;
    }
}
