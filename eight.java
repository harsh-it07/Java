import java.util.Scanner;

public class eight {

    //======================================================
    // CLASS SCOPE VARIABLE
    //======================================================

    // A Class Scope (Global) variable is declared
    // outside all methods but inside the class.
    //
    // It can be accessed by every method of the class.

    static int x = 3;

    public static void main(String[] args) {

        //======================================================
        // METHOD OVERLOADING
        //======================================================

        // Method Overloading means creating multiple methods
        // with the same name but different parameters.
        //
        // Java decides which method to call based on
        // the number or type of arguments.
        //
        // Signature = Method Name + Parameters

//        System.out.println(add(1,2,3,4));

        /*
        static double add(double a, double b){
            return a + b;
        }

        static double add(double a, double b, double c){
            return a + b + c;
        }

        static double add(double a, double b, double c, double d){
            return a + b + c + d;
        }
        */



        //======================================================
        // VARIABLE SCOPE
        //======================================================

        // Variable Scope tells where a variable
        // can be accessed in a program.
        //
        // There are mainly two types:
        //
        // 1. Local Scope
        // 2. Class Scope (Global Scope)



        //======================================================
        // LOCAL SCOPE
        //======================================================

        // A Local Variable is declared inside a method.
        //
        // It can only be used inside that method.

        // int x = 1;

        // System.out.println(x);

        // doingSomething();




        //======================================================
        // LOCAL VS CLASS SCOPE
        //======================================================

        // If a Local variable and a Class variable
        // have the same name,
        //
        // Java always gives priority to
        // the Local Variable inside that method.

        int x = 1;

        System.out.println(x);

        doingSomething();
    }



    //======================================================
    // ANOTHER METHOD
    //======================================================

    static void doingSomething() {

        // This Local Variable is only available
        // inside doingSomething().

        // Even though there is a Class Scope variable
        // named x,
        //
        // this Local variable gets higher priority.

        int x = 2;

        System.out.println(x);

    }



    //======================================================
    // METHOD OVERLOADING EXAMPLES
    //======================================================

    // All these methods have the same name "add()"
    // but different parameters.

    /*
    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }
    */



    //======================================================
    // WHAT I LEARNED
    //======================================================

    // ✔ Method Overloading
    // ✔ Method Signature
    // ✔ Local Scope
    // ✔ Class Scope (Global Variable)
    // ✔ Priority of Local Variable over Class Variable
    // ✔ Accessing Variables in Different Methods

}