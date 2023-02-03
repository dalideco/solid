# SRP

**problem:** The problem in the example is that the Car Manager is taking care of everything

**Solution:** The solution here would be to split the work of the CarManager into different classes :	
- CarDB: contains the db instance
- CarRater: takes care of actions that involve rating cars, like comparing two cars and finding the best car in an array of cars
- CarRepository: CRUD operators

**Diagram:**
![My animated logo](SRP/Diagram.png)

<br>

# OCP

