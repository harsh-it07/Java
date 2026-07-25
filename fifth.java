public class fifth{
    public static void main(String[] args) {
        
//======================================================
// LOGICAL OPERATORS
//======================================================

// Logical operators are used to combine
// two or more conditions.
//
// && -> AND (All conditions must be true.)
// || -> OR (At least one condition must be true.)
// !  -> NOT (Reverses the boolean value.)

// double temp = -20;
// boolean isSunny = false;
//
// if(temp <= 30 && temp >= 0 && isSunny){
//
//     // All conditions are true.
//
//     System.out.println("The weather is good 😃");
//     System.out.println("It's sunny outside ☀️");
//
// }
// else if(temp <= 30 && temp >= 0 && !isSunny){
//
//     // ! changes false to true.
//
//     System.out.println("The weather is good 😃");
//     System.out.println("It's cloudy outside ☁️");
//
// }
// else if(temp > 30 || temp < 0){
//
//     // Only one condition needs to be true.
//
//     System.out.println("The temperature is bad currently 🥵🥶");
//
// }



//======================================================
// USERNAME VALIDATION PROJECT
//======================================================

// This program checks whether the username
// follows some basic rules.
//
// Rules:
// 1. Length should be between 4 and 12.
// 2. No spaces.
// 3. No underscores (_).

// Scanner scanner = new Scanner(System.in);
//
// String username;
//
// System.out.print("Enter your new username : ");
// username = scanner.nextLine();
//
// if(username.length() < 4 || username.length() > 12){
//
//     System.out.println("Username must be between 4 - 12 characters.");
//
// }
// else if(username.contains(" ") || username.contains("_")){
//
//     System.out.println("Username must not contain spaces or underscores.");
//
// }
// else{
//
//     System.out.println("Hello " + username + "!");
// }
//
// scanner.close();



//======================================================
// WHILE LOOP
//======================================================

// while loop keeps executing until
// the condition becomes false.
//
// If the condition is false in the beginning,
// the loop will never execute.

// Scanner scanner = new Scanner(System.in);
//
// String name = "";
//
// while(name.isEmpty()){
//
//     // Program keeps asking until
//     // user enters a valid name.
//
//     System.out.print("Enter your name : ");
//     name = scanner.nextLine();
//
// }
//
// System.out.println("Hello " + name + "!");
//
// scanner.close();



//======================================================
// INFINITE WHILE LOOP
//======================================================

// If the condition is always true,
// the loop never stops.
//
// Press Ctrl + C to stop it manually.

// while(1 == 1){
//
//     System.out.println("HELP I'M STUCK IN A LOOP!");
//
// }



//======================================================
// QUIT GAME USING WHILE LOOP
//======================================================

// Program keeps running until
// user enters Q.

// Scanner scanner = new Scanner(System.in);
//
// String response = "";
//
// while(!response.equals("Q")){
//
//     System.out.println("You are playing a GAME.");
//
//     System.out.print("Enter Q to Quit : ");
//
//     response = scanner.nextLine().toUpperCase();
//
//     // toUpperCase() allows both
//     // q and Q.
//
// }
//
// System.out.println("You Quit the Game!");
//
// scanner.close();



//======================================================
// AGE VALIDATION USING WHILE LOOP
//======================================================

// Program keeps asking for age until
// a valid (positive) age is entered.

// Scanner scanner = new Scanner(System.in);
//
// int age = 0;
//
// System.out.print("Enter your age : ");
// age = scanner.nextInt();
//
// while(age < 0){
//
//     System.out.println("Age can't be negative!");
//
//     System.out.print("Enter your age again : ");
//     age = scanner.nextInt();
//
// }
//
// System.out.println("You are " + age + " years old.");
//
// scanner.close();



//======================================================
// DO-WHILE LOOP
//======================================================

// do-while loop executes the code first,
// then checks the condition.
//
// So the code always runs at least once,
// even if the condition is false.

// Scanner scanner = new Scanner(System.in);
//
// int age = 0;
//
// do{
//
//     System.out.print("Enter your age : ");
//     age = scanner.nextInt();
//
//     System.out.println("Age can't be negative!");
//
// }while(age < 0);
//
// System.out.println("You are " + age + " years old.");
//
// scanner.close();



//======================================================
// NUMBER VALIDATION PROJECT
//======================================================

// Program keeps asking until the user
// enters a number between 1 and 10.

// Scanner scanner = new Scanner(System.in);
//
// int number = 0;
//
// do{
//
//     System.out.print("Enter a number between 1 - 10 : ");
//     number = scanner.nextInt();
//
// }while(number < 1 || number > 10);
//
// System.out.println("You picked " + number);
//
// scanner.close();



//======================================================
// WHAT I LEARNED
//======================================================

// ✔ Logical Operators
// ✔ AND (&&)
// ✔ OR (||)
// ✔ NOT (!)
// ✔ Username Validation
// ✔ while Loop
// ✔ Infinite Loop
// ✔ Loop Until User Gives Correct Input
// ✔ do-while Loop
// ✔ Input Validation using Loops

    }
}