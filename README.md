# Simple_Dice_Console_Game :
<strong> Hello, in my free time i decided to create a simple dice console game. </strong> </br>
</br>
<img align ="center_right" src ="https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/e2bd6f65-ae2f-4246-b4d7-f2e9654cca45" width= "200" higth="200" /> </br>

### Table of Contents
- <strong> Game description </strong> </br>
- <strong> Solution description </strong> </br>
- <strong> Photos </strong> </br>

### Game description
<strong> First of all, your goal is to beat the computer in this game. <img align = "right" src = "https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/d3bc529c-2cfb-434c-9d7f-1f9e5c292d9a" width= "200" higth="300" /></br>
You have to select a number between [1..6] and press "ENTER" to start the game. </br>
Еach participant starts with 0 initial points. </br>
The program shuffles the dice and rolls them. </br>
The game is set up to have 3 dice and 5 rounds, so if the number you pick equals one of the numbers on the dice, your points increase. </br>
After your 5 rounds it's time for the computer to play and it also picks a random number and repeats the steps. </br>
Finally, the game compares the results and prints the winner. </strong> </br>

### Solution description
<strong> 1. First of all I did a simple validation of the number that the player chooses because it can be between [1..6], when the chosen number is not in that range the game throws an error saying that the chosen number must be between [1..6]. </br>
2. I have made a separate Game class that accepts as parameters the number of dice and rounds, having set them to 3 dice and 5 rounds into the constructor of the class.</br>
3. A play() method is also defined in the class, which accepts the name of the player and his chosen number.</br>
4. The purpose of the method is to implement the logic of the game, recreating the number of rounds and the number of dice with two for loops. For each round, the randomly selected dice number is stored in an array, then printed, representing the values ​​of the dice in the specified round. </br>
5. Each dice value is then compared to the player's chosen number, and if a match is made, his points are increased. </strong>

### Photos
<strong> Player input is invalid: </br> 
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/c8d3ed22-22bd-46d6-91aa-9b19e7d4ac6b)

The moment for choose your number: </br>
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/2cd2f11f-11bb-41c3-a86b-2a69b4c77557) </br>

Photo of some of the rounds: </br>
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/482859c0-3a9e-4d4c-8846-d2a04e019cdc) </br>

A picture of the final score of the player's game: </br>
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/929203ef-1cd8-4bc8-8b8b-51443110d5b0) </br>

A photo of some of the computer rounds: </br>
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/01cbe188-8b3a-4b52-a074-9f399181ab8f) </br>

Photo from the game result: </strong> </br>
![image](https://github.com/StefanHristov1997/Simple_Dice_Game/assets/133797718/b3be912e-4744-497b-8481-1bd299e8af72)





