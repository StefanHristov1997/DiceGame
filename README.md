# Simple_Dice_Game :
<strong> Hello, in my free time i decided to create a simple dice console game. </strong> </br>
</br>
<img align ="center_right" src ="https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/e2bd6f65-ae2f-4246-b4d7-f2e9654cca45" width= "200" higth="200" /> </br>

### Table of Contents
- <strong> Game description </strong> </br>
- <strong> Solution description </strong> </br>
- <strong> Photos </strong> </br>

### Game description
<strong> First of all, your goal is to beat the computer in this game. <img align = "right" src = "https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/d3bc529c-2cfb-434c-9d7f-1f9e5c292d9a" width= "200" higth="300" /></br>
You have to select a number between 1-6 and press "ENTER" to start the game. </br>
Еach participant starts with 0 initial points. </br>
The program shuffles the dice and rolls them. </br>
The game is set up to have 3 dice and 5 rounds, so if the number you pick equals one of the numbers on the dice, your points increase. </br>
After your 5 rounds it's time for the computer to play and it also picks a random number and repeats the steps. </br>
Finally, the game compares the results and prints the winner. </strong> </br>

### Solution description
<strong> 1. For first step of the solution for this problem, I have made a separate Game class that accepts as parameters the number of dice and rounds, having set them to 3 dice and 5 rounds into the constructor of the class. 
</br>
</br>
2. A play() method is also defined in the class, which accepts the name of the player and his chosen number.
</br>
</br>
4. The purpose of the method is to implement the logic of the game, recreating the number of rounds and the number of dice with two for loops. For each round, the randomly selected dice number is stored in an array, then printed, representing the values ​​of the dice in the specified round. 
</br>
</br>
5. Each dice value is then compared to the player's chosen number, and if a match is made, his points are increased. </strong>
