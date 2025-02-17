# MarsRover Refactoring Kata
This refactoring kata is based on Google's MarsRover Technical challenge (that 
can be found [here](https://code.google.com/archive/p/marsrovertechchallenge/)).

In the original version, you are asked to write the solution for this challenge. 
For this version, I provided the solution; but, my code is in a very bad shape 
(at least in my opinion). 

Your role is to refactor this code to ensure it follows the clean code 
principles and best practices of design principles.   

## Solving this Kata

Here is what you need to do: 
* Read the original description of the problem below
* Fork this project to your own github account 
* Write tests to cover all the cases described below  
* Refactor the existing code in MarsRover.java while keeping the following 
points in mind:
    * The tests should always be green
    * Use Design Patterns 
    * Follow the S.O.L.I.D principles 
* Write a new feature that would not allow the marsRover to go out of boundaries 


## Problem Description

The problem below requires some kind of input. You are free to implement any 
mechanism for feeding input into your solution (for example, using hard coded 
data within a unit test). You should provide sufficient evidence that your 
solution is complete by, as a minimum, indicating that it works correctly 
against the supplied test data.

We highly recommend using a unit testing framework such as JUnit or NUnit. Even
if you have not used it before, it is simple to learn and incredibly useful.

The code you write should be of production quality, and most importantly, it 
should be code you are proud of.

### MARS ROVERS

A squad of robotic rovers are to be landed by NASA on a coordinate on Mars.

This coordinate, which is curiously rectangular, must be navigated by the rovers 
so that their on board cameras can get a complete view of the surrounding 
terrain to send back to Earth.

A marsRover's position is represented by a combination of an x and y co-ordinates 
and a letter representing one of the four cardinal compass points. The coordinate 
is divided up into a grid to simplify navigation. An example position might be 
0, 0, N, which means the marsRover is in the bottom left corner and facing North.

In order to control a marsRover, NASA sends a simple string of letters. The possible
letters are 'L', 'R' and 'M'. 'L' and 'R' makes the marsRover spin 90 degrees left
or right respectively, without moving from its current spot.

'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

### Input:

The first line of input is the upper-right coordinates of the coordinate, the 
lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been 
deployed. Each marsRover has two lines of input. The first line gives the marsRover's 
position, and the second line is a series of instructions telling the marsRover 
how to explore the coordinate.

The position is made up of two integers and a letter separated by spaces, 
corresponding to the x and y co-ordinates and the marsRover's orientation.

Each marsRover will be finished sequentially, which means that the second marsRover 
won't start to move until the first one has finished moving.

### Output:

The output for each marsRover should be its final co-ordinates and heading.

### Test Input:

5 5

1 2 N

LMLMLMLMM

3 3 E

MMRMMRMRRM

### Expected Output:

1 3 N

5 1 E