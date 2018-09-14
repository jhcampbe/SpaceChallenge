# Space Challenge

The Space Challenge is a simulation of loading rockets with random items that are a given weight, and sending the rockets to Mars.
After loading several rockets, the probability of the rockets successfully landing on Mars is calculated based on the total weight of the 
items in their cargo. The final output is the total budget required to transport all given items to Mars using two different types of 
rockets, U1 and U2.

## Requirements

**You need to have Java installed with a Java compiler in order to simulate the Space Challenge.**

## How to Run Simulation

Clone the GitHub repository.

`C:\Users\Example>git clone https://github.com/jhcampbe/SpaceChallenge.git`

Go into the src directory

`C:\Users\Example>cd SpaceChallenge\src`

Compile and run 'Main.java'

```
C:\Users\Example\GuessTheMovie\src>javac Main.java
C:\Users\Example\GuessTheMovie\src>java Main
```

An example of the output is copied below, showing the total cost to ship all items to Mars using only U1 rockets, and the total cost to
ship all items to Mars using only U2 rockets. The output will be slightly different for each simulation since the chance of any given
rocket successfully launching and landing is based upon a randomized probabiliy equation.

```
Budget for U1 rockets: $1600 million
Budget for U2 rockets: $1560 million
```

