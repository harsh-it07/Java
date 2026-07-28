import java.util.Arrays; // Importing Arrays class for built-in array operations
import java.util.Locale;
import java.util.Scanner;

public class ninth {

    public static void main(String[] args) {


        /*
         =====================================================
         SECTION 1: BASIC ARRAY OPERATIONS
         =====================================================

         Arrays:
         - Store multiple values of the same data type.
         - Index starts from 0.
         - Arrays class provides built-in methods like sort(), fill().

         */


//        String[] fruits = {"mango","apple","banana","orange"};
//
//        Arrays.sort(fruits); 
//        // Sorts array elements in ascending order
//
//        Arrays.fill(fruits, "pineapple"); 
//        // Replaces all elements of array with given value
//
//
//        for (String fruit : fruits){ 
//            // Enhanced for loop to traverse array
//
//            System.out.print(fruit+ " ");
//        }
//
//        fruits[1] = "pineapple"; 
//        // Changing value at index 1
//
//        int lengthOfFruits = fruits.length; 
//        // Finds length of array



        /*
         =====================================================
         SECTION 2: PRINTING ARRAY USING NORMAL FOR LOOP
         =====================================================

         */


//        String[] fruits = {"apple","mango","banana"};
//
//        for (int i=0; i < fruits.length; i++) {
//
//            System.out.print(fruits[i] + " ");
//
//        }




        /*
         =====================================================
         SECTION 3: TAKING USER INPUT IN ARRAY
         =====================================================

         Steps:
         1. Take size from user
         2. Create array of that size
         3. Store values using loop

         */


//        Scanner scanner = new Scanner(System.in);
//
//        String[] foods;
//        int size;
//
//        System.out.print("Enter the number of food items: ");
//        size = scanner.nextInt();
//
//        foods = new String[size];
//
//        scanner.nextLine(); 
//        // Clears leftover enter key after integer input
//
//
//        for (int i = 0; i < foods.length; i++){
//
//            System.out.print("Enter the food item: ");
//            foods[i] = scanner.nextLine();
//
//        }
//
//
//        System.out.println("Total items: " + foods.length);
//
//
//        for (String food : foods){
//
//            System.out.println(food);
//
//        }





        /*
         =====================================================
         SECTION 4: SEARCHING ELEMENT IN ARRAY
         =====================================================

         Linear Search:
         - Check every element one by one.
         - Break loop when element found.

         */


//        int[] numbers = {1,3,5,6,8,9,5,7,0};
//
//        int target = 66;
//
//        boolean isFound = false;
//
//
//        for (int i =0; i < numbers.length; i++){
//
//            if (target == numbers[i]){
//
//                System.out.println("Element found at index "+ i);
//
//                isFound = true;
//
//                break;
//
//            }
//
//        }
//
//
//        if (!isFound){
//
//            System.out.println("Element not found in array !");
//
//        }





        /*
         =====================================================
         SECTION 5: SEARCHING STRING IN ARRAY
         =====================================================

         String comparison:
         Use .equals()
         Do not use ==

         */


//        String[] fruits = {"apple","mango","orange","pineapple"};
//
//        String target;
//
//        boolean isFound = false;
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the name of fruit to search: ");
//
//        target = scanner.nextLine().toLowerCase();
//
//
//        for (int i =0; i < fruits.length; i++){
//
//            if (fruits[i].equals(target)){
//
//                System.out.println("Element found at index "+ i);
//
//                isFound = true;
//
//                break;
//
//            }
//
//        }
//
//
//        if (!isFound){
//
//            System.out.println("Element not found in array !");
//
//        }
//
//        scanner.close();






        /*
         =====================================================
         SECTION 6: VARARGS (...)
         =====================================================

         Varargs:
         - Allows method to accept multiple arguments.
         - Internally converts arguments into an array.
         - Avoids creating multiple overloaded methods.

         Syntax:

         datatype... variableName

         */


//        System.out.println(add(1,2,3,4));
//
//        System.out.println(average(1,2,3,4,5,6,7));






        /*
         =====================================================
         SECTION 7: TWO DIMENSIONAL ARRAY (2D ARRAY)
         =====================================================

         2D Array:
         - Array containing other arrays.
         - Represented as rows and columns.

         Example:
         groceries[row][column]

         */



//        String[] fruits = {"apple","mango","banana"};
//
//        String[] vegetables = {"tomato","potato","onion"};
//
//        String[] milkFood = {"rabri","dahi","chaach"};
//
//
//        String[][] groceries = {fruits, vegetables, milkFood};
//
//
//        for (String[] foods : groceries){
//
//            for (String food : foods){
//
//                System.out.print(food + " ");
//
//            }
//
//            System.out.println();
//
//        }







        /*
         =====================================================
         SECTION 8: DIRECTLY CREATING 2D ARRAY
         =====================================================

         */


//        String[][] groceries = {
//                {"apple","mango","banana"},
//                {"tomato","potato","onion"},
//                {"rabri","dahi","chaach"}
//        };
//
//
//        // Updating values
//
//        groceries[0][1] = "PINEAPPLE";
//
//        groceries[2][0] = "LASSI";
//
//
//        for (String[] foods : groceries){
//
//            for (String food : foods){
//
//                System.out.print(food + " ");
//
//            }
//
//            System.out.println();
//
//        }





        /*
         =====================================================
         SECTION 9: 2D CHARACTER ARRAY EXAMPLE
         =====================================================

         Used in:
         - Game boards
         - Keypads
         - Matrices

         */


//        char[][] telephone = {
//
//                {'1','2','3'},
//                {'4','5','6'},
//                {'7','8','9'},
//                {'*','0','#'}
//
//        };
//
//
//        for (char[] rowpad : telephone){
//
//            for (char numbers : rowpad){
//
//                System.out.print(numbers + " ");
//
//            }
//
//            System.out.println();
//
//        }






    }




    /*
     =====================================================
     SECTION 10: VARARGS METHODS
     =====================================================
     */



//    static int add(int... numbers){
//
//        int sum = 0;
//
//        for (int number : numbers){
//
//            sum += number;
//
//        }
//
//        return sum;
//
//    }





//    static double average(double... numbers){
//
//        double sum = 0;
//
//
//        if(numbers.length == 0){
//
//            return 0;
//
//        }
//
//
//        for(double number : numbers){
//
//            sum += number;
//
//        }
//
//
//        return sum / numbers.length;
//
//    }


}