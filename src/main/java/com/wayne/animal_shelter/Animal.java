package com.wayne.animal_shelter;

abstract class Animal {
    private String name;
    private int order; //arrival time of the animal


// ==  Name  ==
    public Animal(String name) {
        this.name = name;
    }
       public String getName() {
        return name;
    }

// == Order  ==
    public Animal(int order) {
        this.order = order;
    }

    //Set the order
    public void setOrder(int order) {
        this.order = order;
    }
    //Get the order
    public int getOrder() {
        return order;
    }
// == Compare orders  ==
    //returns true if this animal came before the other
    //aids in de-queueing
    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }

    //Need a class for dogs. Inherits animal class. This allows "Dog" to have the same fields as Animal
    class Dog extends Animal {
        //Need a dog constructor
        public Dog(String name) {
            super(name);
        }
    }
    //Same thing for cats. Saves from Duplicating code
    class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
    }
}

