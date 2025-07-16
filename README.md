## 🐾 Animal Shelter Queue System
A Java application that simulates the queue logic used by an animal shelter to manage adoptions. The shelter only houses dogs and cats, and follows strict first-in, first-out (FIFO) rules for processing animals.

## 📌 Problem Description
The animal shelter must support the following adoption rules:

People can adopt the oldest animal overall (dequeueAny).

Or they can choose the oldest dog or oldest cat specifically (dequeueDog, dequeueCat).

They cannot choose a specific animal—only by type and order.

The application maintains separate queues for dogs and cats while tracking arrival order.

## 🧠 Concepts Demonstrated
Inheritance and polymorphism via Animal, Dog, and Cat classes.

Queue data structures using Java’s LinkedList.

Timestamp simulation with custom order tracking.

Modular design with clean separation of responsibilities.

Spring Boot setup for future scalability.

### 📦 Project Structure
src/main/java/com/wayne/animal_shelter/
- ├── Animal.java          # Abstract base class
- ├── Dog.java             # Dog class extending Animal
- ├── Cat.java             # Cat class extending Animal
- ├── AnimalShelter.java   # Queue logic implementation
- ├── AnimalShelterApplication.java    # Spring Boot entry point
- ├── AnimalShelterDemo.java           # Console-based example run
  
# 🚀 How to Run
Use the AnimalShelterDemo class to observe shelter behavior in a console environment:

bash

# Run the demo class
java com.wayne.animal_shelter.AnimalShelterDemo
Expected output:

text
- Adopting oldest animal: Dog named Rex [order=0]
- Adopting oldest dog: Dog named Buddy [order=2]
- Adopting oldest cat: Cat named Whiskers [order=1]
- Is cat queue empty? false
Note: Make sure your Animal class has a proper toString() method to display names clearly.

*** ✅ Testing
Basic context verification is in place using Spring Boot’s default test scaffold:

java
@SpringBootTest

public class AnimalShelterApplicationTests {

    @Test
    
    void contextLoads() {
    
        // Verifies Spring application bootstraps correctly
        
    }
    
}

This can be expanded in future phases to include proper unit and integration tests.

## 🧰 Technologies Used
Java 17+

Spring Boot 3.5+

IntelliJ IDEA

Maven (for dependency and build management)

JUnit 5 (optional for testing)

###💡 Future Improvements
This project can evolve from a console-based demo into a full web application by adding:

🔌 REST endpoints for enqueue and adoption operations

🗃️ Database persistence with Spring Data JPA

🖥️ Web front-end for user interactions

🧪 Robust unit and integration testing

🐾 Author
Developed by Wayne as part of a classroom coding exercise to demonstrate applied queue structures and object-oriented principles in Java.
