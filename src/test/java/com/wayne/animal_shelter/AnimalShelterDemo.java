package com.wayne.animal_shelter;

import com.wayne.animal_shelter.service.AnimalShelter;
import com.wayne.animal_shelter.model.Dog;
import com.wayne.animal_shelter.model.Cat;


public class AnimalShelterDemo {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("Kevin"));
        shelter.enqueue(new Cat("Penelope"));
        shelter.enqueue(new Dog("Molly"));
        shelter.enqueue(new Cat("Mittens"));


        System.out.println("Adopting oldest animal: " + shelter.dequeueAny());  // Kevin
        System.out.println("Adopting oldest dog: " + shelter.dequeueDog());    // Molly
        System.out.println("Adopting oldest cat: " + shelter.dequeueCat());    // Penelope
        System.out.println("Is cat queue empty? " + (shelter.dequeueCat() == null));  // Should be false (Mittens still there)
    }
}
