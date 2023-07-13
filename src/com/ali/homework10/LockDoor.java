package com.ali.homework10;

public class LockDoor {
    public static void run()
    {
        boolean[] doors = new boolean[101];

        for (int key = 1; key <= 20; key++) {
            for (int door = key; door <= 100; door += key) {
                doors[door] = !doors[door];
            }
        }

        for (int door = 1; door <= 100; door++) {
            if (doors[door]) {
                System.out.println("Door " + door + " is open.");
            }
        }
    }
}
