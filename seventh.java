public class seventh{
    public static void main(String[] args) {
        
//======================================================
// METHODS IN JAVA
//======================================================

// A Method is a block of reusable code.
//
// Instead of writing the same code again and again,
// we can create a method once and call it whenever needed.
//
// Syntax:
//
// returnType methodName(parameters){
//
//      // Code
//
// }

// String name = "Harshit";
// int age = 19;
//
// // Calling the method
// // The values passed while calling a method are called Arguments.
//
// happyBirthday(name, age);



//======================================================
// METHOD WITH RETURN VALUE
//======================================================

// A method can also return a value.
//
// return sends the result back to the place
// where the method was called.

// System.out.println(square(3));



//======================================================
// RETURNING A STRING
//======================================================

// A method can return any datatype,
// including String.

// String fullName = getFullName("Harshit", "Sharma");
//
// System.out.println(fullName);



//======================================================
// RETURNING A BOOLEAN VALUE
//======================================================

// A boolean method returns either
// true or false.
//
// It is mostly used inside if statements.

// int age = 12;
//
// if(ageCheck(age)){
//
//     System.out.println("You may sign up!");
//
// }
// else{
//
//     System.out.println("You must be 18+ to sign up.");
//
// }



//======================================================
// METHOD : happyBirthday()
//======================================================

// This method doesn't return anything,
// so its return type is void.
//
// Parameters receive the values passed
// from the method call.

// static void happyBirthday(String name, int age){

//     System.out.println("Happy Birthday to you!");
//     System.out.printf("Happy Birthday Dear %s!\n", name);
//     System.out.printf("You are %d years old.\n", age);
//     System.out.println("Happy Birthday to you!\n");

// }



//======================================================
// METHOD : square()
//======================================================

// This method returns the square
// of a given number.
//
// return is used to send the value back
// to the method call.

// static double square(double number){

//     return number * number;

// }



//======================================================
// METHOD : getFullName()
//======================================================

// This method joins two strings
// and returns the complete name.

// static String getFullName(String first, String second){

//     return first + " " + second;

// }



//======================================================
// METHOD : ageCheck()
//======================================================

// This method checks whether
// the given age is eligible.
//
// If age is 18 or above,
// it returns true.
// Otherwise it returns false.

// static boolean ageCheck(int age){

//     if(age >= 18){

//         return true;

//     }
//     else{

//         return false;

//     }

// }



//======================================================
// PARAMETERS VS ARGUMENTS
//======================================================

// Parameters:
// Variables written inside the method definition.
//
// Example:
//
// static void greet(String name)
//
// Here "name" is a Parameter.
//
//
// Arguments:
// Actual values passed while calling the method.
//
// greet("Harshit");
//
// Here "Harshit" is an Argument.


//======================================================
// RETURN TYPES
//======================================================

// void
// -> Returns nothing.
//
// int
// -> Returns an integer.
//
// double
// -> Returns a decimal number.
//
// String
// -> Returns text.
//
// boolean
// -> Returns true or false.


//======================================================
// WHAT I LEARNED
//======================================================

// ✔ Methods
// ✔ Why methods are used
// ✔ Method Calling
// ✔ Parameters
// ✔ Arguments
// ✔ Return Keyword
// ✔ void Methods
// ✔ Returning int, double, String & boolean
// ✔ Creating Reusable Code
// ✔ Passing Values to Methods

    }
}