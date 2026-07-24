import java.util.Scanner;
class first {
    public static void main(String[] args) {
/*
==========================================
        JAVA SCANNER - USER INPUT
==========================================

Topics Covered:
1. Taking String Input
2. Taking Integer Input
3. Taking Double Input
4. Taking Boolean Input
5. Common Scanner Issue
6. Rectangle Area Calculator
*/

        /*
        ==========================================
                1. TAKING USER INPUT
        ==========================================

        Scanner is used to take input from the keyboard.
        next()      -> Reads only one word.
        nextLine()  -> Reads the complete line.
        nextInt()   -> Reads an integer.
        nextDouble()-> Reads decimal numbers.
        */

//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter your name : ");
//                String name = scanner.nextLine(); // Reads complete line (including spaces)
//
//                System.out.print("Enter your age : ");
//                int age = scanner.nextInt(); // Reads integer value
//
//                System.out.print("Enter your GPA : ");
//                double gpa = scanner.nextDouble(); // Reads decimal value
//
//                System.out.println("Namaste " + name + "!");
//                System.out.println("You are " + age + " years old!");
//                System.out.println("Your GPA is " + gpa);




        /*
        ==========================================
                2. BOOLEAN INPUT
        ==========================================

        nextBoolean() accepts only:
        true
        false

        Useful for Yes/No type conditions.
        */

//        System.out.print("Are you a student (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Student : " + isStudent);
//
//        if(isStudent){
//            System.out.println("You are an enrolled student.");
//        }
//        else{
//            System.out.println("You are not a student.");
//        }




        /*
        ==========================================
            3. COMMON SCANNER ISSUE
        ==========================================

        Problem:
        nextInt(), nextDouble(), etc. leave the Enter key
        (\n) inside the Scanner buffer.

        Solution:
        Use scanner.nextLine() once to clear it.
        */


//        System.out.print("Enter your age : ");
//        int age = scanner.nextInt();
//
//        scanner.nextLine(); // Clears leftover newline
//
//        System.out.print("Enter your favourite color : ");
//        String color = scanner.nextLine();
//
//        System.out.println("Age : " + age);
//        System.out.println("Favourite Color : " + color);




        /*
        ==========================================
            4. RECTANGLE AREA CALCULATOR
        ==========================================

        Formula:
        Area = Length × Width
        */

//        System.out.println("Area of Rectangle Calculator");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Side A : ");
//        double sideA = scanner.nextDouble();
//
//        System.out.print("Enter Side B : ");
//        double sideB = scanner.nextDouble();
//
//        double area = sideA * sideB;
//
//        System.out.println(
//                "Area of Rectangle = " + area + " cm²"
//        );




        /*
        ==========================================
                GOOD PRACTICE
        ==========================================

        Always close the Scanner object after use.
        */

//                scanner.close();
            }
        }
