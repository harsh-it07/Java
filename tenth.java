public class sixth {

    public static void main(String[] args){

        //======================================================
        // OBJECTS IN JAVA
        //======================================================

        // An Object is a real-world entity that
        // contains:
        //
        // 1. Attributes (Data / Variables)
        // 2. Methods (Actions / Functions)
        //
        // Objects are created from a Class.
        //
        // Objects are Reference Data Types, which means
        // they store the reference (address) of an object
        // instead of the actual value.



        //======================================================
        // CREATING AN OBJECT
        //======================================================

        // Syntax:
        //
        // ClassName objectName = new ClassName();
        //
        // Here,
        // Car      -> Class Name
        // car      -> Object Name
        // new Car() -> Creates a new Car object

        Car car = new Car();



        //======================================================
        // ACCESSING ATTRIBUTES
        //======================================================

        // We use the Dot (.) Operator to access
        // variables (attributes) of an object.

        System.out.println(car.isRunning);



        //======================================================
        // CALLING METHODS
        //======================================================

        // Methods are also accessed using
        // the Dot (.) Operator.
        //
        // Here start() changes the value of
        // isRunning from false to true.

        car.start();

        System.out.println(car.isRunning);



        //======================================================
        // STOP METHOD
        //======================================================

        // stop() changes isRunning
        // back to false.

        car.stop();

        System.out.println(car.isRunning);



        //======================================================
        // OTHER METHODS
        //======================================================

        // Calling different methods of
        // the Car object.

        car.drive();

        car.brake();



        //======================================================
        // MODIFYING ATTRIBUTES
        //======================================================

        // We can also change the values
        // of object attributes using the
        // Dot (.) Operator.

        car.isRunning = true;

        car.year = 2026;



        //======================================================
        // PRINTING OBJECT ATTRIBUTES
        //======================================================

        // Accessing all attributes
        // of the Car object.

        System.out.println(car.make);

        System.out.println(car.model);

        System.out.println(car.year);

        System.out.println(car.price);

        System.out.println(car.isRunning);

    }



    //======================================================
    // WHAT I LEARNED
    //======================================================

    // ✔ Objects
    // ✔ Class and Object
    // ✔ Creating an Object using new
    // ✔ Object is a Reference Data Type
    // ✔ Attributes (Variables)
    // ✔ Methods (Functions)
    // ✔ Dot (.) Operator
    // ✔ Accessing Object Variables
    // ✔ Calling Object Methods
    // ✔ Modifying Object Attributes
}