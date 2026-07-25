public class third{
    public static void main(String[] args) {
        
        //======================================================
// HYPOTENUSE OF A TRIANGLE
//======================================================

// Formula:
// c = √(a² + b²)
//
// Math.pow(number, power) -> used to find the power of a number.
// Math.sqrt(number) -> used to find the square root.

// Scanner scanner = new Scanner(System.in);
//
// double a;
// double b;
// double c;
//
// System.out.print("Enter the length of side A : ");
// a = scanner.nextDouble();
//
// System.out.print("Enter the length of side B : ");
// b = scanner.nextDouble();
//
// c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
// System.out.println("The Hypotenuse of triangle is : " + c + " cm");
//
// scanner.close();



//======================================================
// CIRCLE CALCULATOR
//======================================================

// Formulas:
//
// Circumference = 2 × π × radius
//
// Area = π × radius²
//
// Volume of Sphere = (4/3) × π × radius³
//
// Math.PI gives the value of π (3.14159...)


// Scanner scanner = new Scanner(System.in);
//
// double radius;
//
// System.out.print("Enter the Radius of the given circle : ");
// radius = scanner.nextDouble();
//
// double circumference = 2 * Math.PI * radius;
// double area = Math.PI * Math.pow(radius,2);
// double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
//
// System.out.printf("Circumference of circle : %.1f cm\n", circumference);
// System.out.printf("Area of circle : %.1f cm²\n", area);
// System.out.printf("Volume of sphere : %.1f cm³\n", volume);
//
// scanner.close();



//======================================================
// printf() IN JAVA
//======================================================

// printf() is used to print formatted output.
//
// It is an alternative to print() and println().
//
// Syntax:
//
// %[flags][width][.precision][specifier]

// String name = "Sponge Bob";
// char firstLetter = 'S';
// int age = 30;
// double height = 60.2;
// boolean isEmployed = true;
//
// System.out.printf("Hello %s\n", name);
// System.out.printf("Your name starts with %c\n", firstLetter);
// System.out.printf("You are %d years old\n", age);
// System.out.printf("You are %.1f inches tall\n", height);
// System.out.printf("Are you employed : %b\n", isEmployed);
//
// // We can print multiple variables in one line.
//
// System.out.printf("%s is %d years old.\n", name, age);



//======================================================
// printf() SPECIFIERS
//======================================================

// %s -> String
// %c -> Character
// %d -> Integer
// %f -> Floating point number
// %b -> Boolean
// %n -> New Line (platform independent)



//======================================================
// printf() FLAGS
//======================================================

// Flags change how the output looks.
//
// +  -> shows + sign before positive numbers.
// ,  -> adds comma separator (10,000)
// (  -> encloses negative numbers inside brackets.
// space -> leaves a space before positive numbers.

// double price1 = 9.99;
// double price2 = 100.15;
// double price3 = -54.059;
//
// System.out.printf("% .1f\n", price1);
// System.out.printf("% .1f\n", price2);
// System.out.printf("% .1f\n", price3);



//======================================================
// printf() WIDTH
//======================================================

// Width decides how much space should be reserved.
//
// 0  -> Zero Padding
// Positive number -> Right Justified
// Negative number -> Left Justified

// int id1 = 1;
// int id2 = 23;
// int id3 = 456;
// int id4 = 7890;
//
// System.out.printf("%-5d\n", id1);
// System.out.printf("%-5d\n", id2);
// System.out.printf("%-5d\n", id3);
// System.out.printf("%-5d\n", id4);



//======================================================
// NESTED IF STATEMENTS
//======================================================

// Nested if means writing one if statement
// inside another if statement.
//
// Useful when multiple conditions depend
// on each other.

// boolean isStudent = false;
// boolean isSenior = false;
// double price = 9.99;
//
// if(isStudent){
//
//     if(isSenior){
//
//         System.out.println("You get a senior discount of 20%");
//         System.out.println("You also get a student discount of 10%");
//
//         price *= 0.7;
//
//     }
//     else{
//
//         System.out.println("You get a student discount of 10%");
//
//         price *= 0.9;
//     }
// }
// else{
//
//     if(isSenior){
//
//         System.out.println("You get a senior discount of 20%");
//
//         price *= 0.8;
//     }
//     else{
//
//         price *= 1;
//     }
// }
//
// System.out.printf("The ticket price is %.2f $", price);



//======================================================
// WHAT I LEARNED
//======================================================

// ✔ Using Math.sqrt() and Math.pow()
// ✔ Using Math.PI
// ✔ Calculating Hypotenuse
// ✔ Calculating Circle Properties
// ✔ printf() formatting
// ✔ Format Specifiers
// ✔ Flags and Width
// ✔ Nested if statements

    }
}