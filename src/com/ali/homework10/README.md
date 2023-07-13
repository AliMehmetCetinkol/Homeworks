# Homework Explanation
- LockDoor : <br>
There are 100 doors. These gates are numbered from 1 to 100. Initially all the doors are locked.
We have 20 keys numbered 1 to 20. If the number of a door is divided by the number of a key,
that key can open or lock that door.We go through all the doors, starting with key 1.
We open or lock the door with the key.(In other words, if the door is open, it locks,if it is closed, we open it.)
After the 20th round, it prints the open doors on the screen.<br>
Example :<br>
1 4 9 16 21 22 23 24 26.........92 95 97

- findMod : <br>
The program that finds the most repeated number in an array of int type that it takes with its parameter.

- isPossibleTest : <br>
A program that tests whether two numbers can be obtained with the digits of the first number from the second number.
Example :<br>
A = 2735, B = 5273 - writable <br>
A = 28, B = 823 - unwritable<br>


# How to run

```
package com.ali.app;

public class App {
    public static void main(String[] args) {
        LockDoor.run();
        findMod.run();
        isPossibleTest.runn();
    }
}
```
