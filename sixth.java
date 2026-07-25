public class sixth{
    public static void main(String[] args) {
        
//======================================================
// FOR LOOP
//======================================================

// A for loop is used when we know
// how many times we want to repeat a block of code.
//
// Syntax:
//
// for(initialization; condition; update)
//
// initialization -> Runs only once at the beginning.
// condition      -> Checked before every iteration.
// update         -> Runs after every iteration.

// Count from 0 to 9

// for(int i = 0; i < 10; i++){
//     System.out.println(i);
// }



//======================================================
// COUNTING BACKWARDS
//======================================================

// We can also decrease the value
// using i--.

// for(int i = 10; i > 0; i--){
//
//     System.out.println(i);
//
// }



//======================================================
// CHANGING THE STEP VALUE
//======================================================

// Instead of increasing by 1,
// we can increase or decrease by any value.

// Count by 2's

// for(int i = 0; i < 10; i += 2){
//
//     System.out.println(i);
//
// }

// Count backwards by 3's

// for(int i = 10; i > 0; i -= 3){
//
//     System.out.println(i);
//
// }



//======================================================
// USER CONTROLLED LOOP
//======================================================

// Instead of fixing the number of loops,
// we can ask the user how many times
// the loop should execute.

// Scanner scanner = new Scanner(System.in);
//
// System.out.print("Enter how many times you want to loop : ");
// int max = scanner.nextInt();
//
// for(int i = 1; i <= max; i++){
//
//     System.out.println(i);
//
// }
//
// scanner.close();



//======================================================
// BREAK STATEMENT
//======================================================

// break immediately stops the loop.
//
// Once break is executed,
// the loop terminates completely.

// for(int i = 0; i <= 10; i++){
//
//     if(i == 5){
//
//         break;      // Stops the loop
//
//     }
//
//     System.out.print(i + " ");
//
// }



//======================================================
// CONTINUE STATEMENT
//======================================================

// continue skips the current iteration
// and moves to the next one.
//
// The loop itself does not stop.

// for(int i = 0; i <= 10; i++){
//
//     if(i == 5){
//
//         continue;   // Skip number 5
//
//     }
//
//     System.out.print(i + " ");
//
// }



//======================================================
// NESTED LOOPS
//======================================================

// A Nested Loop means writing
// one loop inside another loop.
//
// The outer loop executes first.
// For every one iteration of the outer loop,
// the inner loop executes completely.
//
// Mostly used for:
// • Matrices
// • Tables
// • Pattern Printing
// • DSA Problems

// for(int i = 1; i <= 3; i++){
//
//     for(int j = 0; j <= 9; j++){
//
//         System.out.print(j + " ");
//
//     }
//
//     System.out.println();
//
// }



//======================================================
// PATTERN PRINTING PROJECT
//======================================================

// This program prints a rectangle
// made of any symbol entered by the user.
//
// Example:
//
// Rows = 4
// Columns = 6
// Symbol = *
//
// Output:
//
// ******
// ******
// ******
// ******

// Scanner scanner = new Scanner(System.in);
//
// int rows;
// int columns;
// char symbol;
//
// System.out.print("Enter the number of rows : ");
// rows = scanner.nextInt();
//
// System.out.print("Enter the number of columns : ");
// columns = scanner.nextInt();
//
// System.out.print("Enter the symbol to use : ");
//
// symbol = scanner.next().charAt(0);
//
// // next() reads a String.
// // charAt(0) takes the first character
// // from that String.
//
// for(int i = 0; i < rows; i++){
//
//     System.out.println();
//
//     for(int j = 0; j < columns; j++){
//
//         System.out.print(symbol);
//
//     }
// }
//
// scanner.close();



//======================================================
// WHAT I LEARNED
//======================================================

// ✔ for Loop
// ✔ Initialization
// ✔ Condition
// ✔ Update
// ✔ Increment (++)
// ✔ Decrement (--)
// ✔ Changing Step Size (+=, -=)
// ✔ Taking Loop Count from User
// ✔ break Statement
// ✔ continue Statement
// ✔ Nested Loops
// ✔ Pattern Printing using Nested Loops
// ✔ next().charAt(0) to take a Character as Input
    }
}