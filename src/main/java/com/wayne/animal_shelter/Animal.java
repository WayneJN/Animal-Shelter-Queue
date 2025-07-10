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


}
