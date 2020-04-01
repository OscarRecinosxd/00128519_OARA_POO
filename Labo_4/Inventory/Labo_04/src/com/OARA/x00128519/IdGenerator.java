package com.OARA.x00128519;

public class IdGenerator {
    private static int counter;

    private  IdGenerator(){
        counter=0;
    }

    public static int newId(){
        counter++;
        return counter;
    }


}
