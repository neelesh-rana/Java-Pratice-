//
//
////    Abstract Class in Java
//
//
//
//Abstract Classes — Complete Explanation

//What Problem Does It Solve First?

//Imagine you're building a program with different shapes — Circle, Rectangle, Triangle.
//All shapes must have an area. But the formula for area is different for each shape. So how do you make sure every shape class always has an area() method?
//Answer: Abstract Class.
//

//What is an Abstract Class?
//An abstract class is a blueprint for other classes.
//

//You cannot create an object from it directly
//It forces its child classes to implement certain methods
//It can have both complete and incomplete methods
//
//Think of it like a job description template. The template says "every employee must be able to do X" — but HOW they do X depends on the specific role.
//│






//        ├── Uses keyword → abstract class ClassName
//├── Abstract method → abstract returnType methodName();
//├── CAN have constructor (unlike interfaces)
//├── CAN have instance variables
//├── CAN have normal methods
//├── CANNOT be instantiated with new
//            │
//            └── Child Class (extends)
//    ├── MUST implement ALL abstract methods
//    ├── Uses @Override before each method
//    └── If it doesn't implement → child must also be abstract
