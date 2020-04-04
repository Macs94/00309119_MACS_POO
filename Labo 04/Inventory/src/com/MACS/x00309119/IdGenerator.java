package com.MACS.x00309119;

public final class IdGenerator {
    private static int counter = 0;

    private IdGenerator() {
    }
    public static int newID(){
        counter++;
        return counter;
    }
}
