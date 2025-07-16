package com.wayne.animal_shelter.service;

import com.wayne.animal_shelter.model.Animal;
import com.wayne.animal_shelter.model.Dog;
import com.wayne.animal_shelter.model.Cat;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {
    private final Queue<Dog> dogs = new LinkedList<>();
    private final Queue<Cat> cats = new LinkedList<>();
    private int order = 0;

    // Admit new animal
    // Assigns current order number to the animal, and increments it
    public void enqueue(Animal animal) {
        animal.setOrder(order++);
        // If a dog, cast it and add to dogs queue
        if (animal instanceof Dog) {
            dogs.add((Dog) animal);
            // If a cat, cast it and add to cats queue
        } else if (animal instanceof Cat) {
            cats.add((Cat) animal);
        }
    }

    // Adopt oldest animal
    public Animal dequeueAny() {
        // If either Queue is empty, then switch to other type
        if (dogs.isEmpty()) return dequeueCat();
        if (cats.isEmpty()) return dequeueDog();
        // Have a look at the dog and cat, to compare arrival times
        Dog dog = dogs.peek();
        Cat cat = cats.peek();

        return dog.isOlderThan(cat) ? dequeueDog() : dequeueCat();
    }

    // Adopt oldest dog
    public Dog dequeueDog() {
        return dogs.poll();
        // This removes the head of the dogs queue, ie the oldest. If empty, returns null
    }

    // Adopt oldest cat
    public Cat dequeueCat() {
        return cats.poll();
        // This removes the head of the cats queue, ie the oldest. If empty, returns null
    }
}
