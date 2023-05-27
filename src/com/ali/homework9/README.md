# Homework Explanation
- masterMind : <br>
The game called masterMind is a number puzzle game played with two people.
One of the players chooses a different number from the set [1000-9999]. The other player's goal is to find that number in a maximum of 10 guesses. 
The player who determines the number gives information in accordance with the rules of the game after each guess of the other player.
If there is one of the digits in the determined number within the estimated number, but the place value does not match, 
it gives information with - sign, if it also holds the place value, it gives information with + sign.<br>
Example :<br>
Determined number : 1234 <br>
Estimated number : 4567<br>
Information to be given: -<br>
----------------------------------------<br>
Determined number : 1234<br>
Estimated number : 5674<br>
Information to be given: +<br>
Note: + and - are not important in the information to be given.<br>
- secondMax : <br>
Program that finds the second largest element of an array of int type that it takes with its parameter.


# How to run

```
package com.ali.app;

public class App {
    public static void main(String[] args) {
        mastterMind.run();
        secondMax.run();
    }
}
```
