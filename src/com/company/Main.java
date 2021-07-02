package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteVelue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteVelue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

      long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) ((myMinByteVelue / 2));

        short myNewShortValue = (short) ((myMinShortValue / 2));

        byte chalByteValue = 120;
        short chalShortValue = 30000;
        int chalIntValue = 25000;
        long chalLongValue = 50000 + (10 * (chalByteValue + chalShortValue + chalIntValue));
        System.out.println("The total from the primitive types challenge is " + chalLongValue);





    }
}
