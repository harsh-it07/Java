//======================================================
// CONSTRUCTORS IN JAVA
//======================================================

// A Constructor is a special method that is
// automatically called whenever an object is created.
//
// It is mainly used to initialize (assign)
// values to an object's attributes.
//
// Rules:
// • Constructor name must be the same as the Class Name.
// • Constructors do not have any return type (not even void).

public class eleventh {

    public static void main(String[] args) {

        //======================================================
        // CREATING OBJECTS USING CONSTRUCTOR
        //======================================================

        // Syntax:
        //
        // ClassName objectName = new ClassName(arguments);
        //
        // The values passed while creating an object
        // are called Arguments.

        Student student1 = new Student("Harshit", 19, 8.53);
        Student student2 = new Student("Kelvin", 21, 9.18);



        //======================================================
        // ACCESSING OBJECT ATTRIBUTES
        //======================================================

        // We use the Dot (.) Operator to access
        // variables (attributes) of an object.

//        System.out.print(student1.name);
//        System.out.print(" " + student1.age);
//        System.out.print(" " + student1.gpa);
//
//        System.out.print("\n" + student2.name);
//        System.out.print(" " + student2.age);
//        System.out.print(" " + student2.gpa);



        //======================================================
        // ACCESSING BOOLEAN ATTRIBUTE
        //======================================================

        // isEnrolled is automatically assigned
        // the value true inside the constructor.

//        System.out.println(student1.isEnrolled);
//        System.out.println(student2.isEnrolled);



        //======================================================
        // CALLING METHODS
        //======================================================

        // Methods are also accessed using
        // the Dot (.) Operator.

        student1.study();
        student2.study();

    }
}



//======================================================
// STUDENT CLASS
//======================================================

// Student class is a blueprint used to
// create Student objects.
//
// It contains:
// • Attributes (Variables)
// • Constructor
// • Methods

class Student {

    //======================================================
    // ATTRIBUTES (INSTANCE VARIABLES)
    //======================================================

    // These variables belong to every Student object.

    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;



    //======================================================
    // CONSTRUCTOR
    //======================================================

    // This constructor is automatically called
    // whenever a Student object is created.
    //
    // It initializes the attributes of the object.

    Student(String name, int age, double gpa) {

        //======================================================
        // "this" KEYWORD
        //======================================================

        // "this" refers to the current object.
        //
        // Here the constructor parameters and
        // instance variables have the same names.
        //
        // this.name -> Object's variable
        // name      -> Constructor parameter

        this.name = name;
        this.age = age;
        this.gpa = gpa;

        // We can also directly assign values
        // without passing them as arguments.

        this.isEnrolled = true;
    }



    //======================================================
    // METHOD
    //======================================================

    // study() is a void method.
    //
    // this.name refers to the name of
    // the current object.

    void study() {

        System.out.println(this.name + " is Studying!");

    }

}



//======================================================
// WHAT I LEARNED
//======================================================

// ✔ Constructors
// ✔ Why Constructors are used
// ✔ Constructor Parameters
// ✔ Constructor Arguments
// ✔ Object Initialization
// ✔ this Keyword
// ✔ Instance Variables (Attributes)
// ✔ Creating Multiple Objects
// ✔ Dot (.) Operator
// ✔ Calling Methods
// ✔ Accessing Object Attributes