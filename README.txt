Animal Project
Classes
Animal
    name
    age
    hunger
    Animal(name, age, hunger)
        - constructor
    getName
    getAge
    getHunger
    setHunger
    eat()
        - abstract method
    compareTo
        - comparable
Bear
    type
    bear(name, age, hunger, type)
        - constructor
    increaseHunger(n)
        - recursive adjustHunger helper
    adjustHunger()
        - generate hunger level from hunger scale
    writeFood()
        - reads food file, selects food, write ate file
    eat()
        - feeds the bear bring hunger to 0
Tiger
    stripes
    Tiger(name, age, hunger, stripes)
        - constructor
    huntingRank
        - generate hunting rank using tiger parameters
    eat()
        - prints eating status

Interface
    Predator
        - huntingRank

Start up instructions:
Assuming you have Java on your computer.
This program only requires you to load the following files into IDE
Animal.java
Bear.java
Predator.java
Tiger.java
Main.java
food.txt
ate.txt