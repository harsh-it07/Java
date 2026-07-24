import java.util.Scanner;
public class second {
    public static void main(String []args){
//==========================================
// Arithmetic Operations
//==========================================

// Arithmetic operators are used to perform
// basic mathematical calculations.

// int x = 10;
// int y = 3;
// int z;
//
// z = x + y; // Addition
// z = x - y; // Subtraction
// z = x * y; // Multiplication
// z = x / y; // Division (returns quotient)
// z = x % y; // To find the remainder between two numbers
//
// System.out.println(z);



//==========================================
// Augmented Assignment Operators
//==========================================

// These operators are a shorter way of writing
// the same operation.

// int x = 10;
// int y = 3;
//
// x += y; // for x = x + y; it gives the same result, so we use += to make the code shorter.
// x -= y; // same as x = x - y;
// x *= y; // same as x = x * y;
// x /= y; // same as x = x / y;
// x %= y; // same as x = x % y;
//
// System.out.println(x);



//==========================================
// Increment & Decrement Operator
//==========================================

// ++ increases the value by 1.
// -- decreases the value by 1.
//
// Mostly used in loops because it is a shorter
// way of writing x = x + 1 or x = x - 1.

// int x = 2;
//
// // x += 1; can also be written as x++;
//
// x++; // Add 1 to x
// x++; // Again add 1
//
// x--; // Subtract 1 from x
// x--; // Again subtract 1
//
// System.out.println(x);



//==========================================
// Order of Operation (PEMDAS)
//==========================================

// Java follows the order:
//
// P -> Parentheses
// E -> Exponents
// M -> Multiplication
// D -> Division
// A -> Addition
// S -> Subtraction
//
// Operations with higher priority are
// performed first.

// double result = 3 + 4 * (7 - 5) / 2.0;
//
// System.out.println(result);



//==========================================
// IF Statements
//==========================================

// if statement executes a block of code
// only when the condition is true.
//
// else if is used when there are multiple
// conditions.
//
// else runs if none of the above conditions
// are true.

// Scanner scanner = new Scanner(System.in);
//
// String name;
// int age;
// boolean isStudent;
//
// System.out.print("Enter your name : ");
// name = scanner.nextLine();
//
// System.out.print("How old are you? : ");
// age = scanner.nextInt();
//
// System.out.print("Are you a student (true/false) : ");
// isStudent = scanner.nextBoolean();



//------------ Group 1 : Name ------------

// isEmpty() checks whether the string is empty
// or not.

// if(name.isEmpty()){
//     System.out.println("You didn't enter your name!");
// }
// else{
//     System.out.println("Hello " + name + "!");
// }



//------------ Group 2 : Age ------------

// if(age >= 65){
//     System.out.println("You are a senior!");
// }
// else if(age >= 18){
//     System.out.println("You are an adult!");
// }
// else if(age < 0){
//     System.out.println("You haven't been born yet.");
// }
// else{
//     System.out.println("You are a child!");
// }



//------------ Group 3 : Student ------------

// Since isStudent is boolean,
// it can only be true or false.

// if(isStudent){
//     System.out.println("You are a student!");
// }
// else{
//     System.out.println("You are not a student.");
// }
//
// scanner.close();



//==========================================
// Java Math Class
//==========================================

// Math class provides built-in methods
// to perform mathematical calculations.
//
// We don't need to create an object.
// Just write Math.methodName().

// System.out.println(Math.PI); // Gives the value of π (3.14159...)
// System.out.println(Math.E);  // Gives the value of Euler's number (2.718...)
//
// double result;
//
// result = Math.pow(2,3);    // Raises 2 to the power of 3 (2³ = 8)
// result = Math.abs(-10);    // Returns the positive value (absolute value)
// result = Math.sqrt(9);     // Returns the square root of 9
// result = Math.round(3.14); // Rounds to the nearest whole number
// result = Math.ceil(3.14);  // Always rounds up
// result = Math.floor(3.99); // Always rounds down
// result = Math.max(10,20);  // Returns the greater number
// result = Math.min(10,20);  // Returns the smaller number
//
// System.out.println(result);

    }
}
