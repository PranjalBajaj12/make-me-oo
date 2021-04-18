So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

**Problems Articulated in Shivam OOP solution:**

- Point.java file:
1. In Point class setter function is not required because they are used for class fields          whose value change with time.
2. The class fields that is xCoordinate and yCoordinate must be declared as final.
3. The object creation for a class Point must only be using the constructor as it include information that do not change after object creation.
3. Getter method is not required for the solution.

- DistanceAndDirectionCalculator.java file:
1. As this class does not have its own class fields and ,methods implemented also uses Point class objects as its parameter So we can encapsulate the functionality to find distance and direction between two points in Point class only. It enables to implement encapsulation OOP concept properly.