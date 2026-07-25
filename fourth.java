public class fourth{
    public static void main(String[] args) {
        
//======================================================
// STRING METHODS
//======================================================

// String methods are built-in methods that help us
// perform different operations on strings.

// String name = "Harshit Sharma";
//
// int length = name.length(); // Returns the total number of characters (spaces are also counted)
//
// char letter = name.charAt(0); // Returns the character present at the given index.
//
// int index = name.indexOf("a"); // Returns the index of the first occurrence of the character.
//
// int lastIndex = name.lastIndexOf("a"); // Returns the index of the last occurrence of the character.
//
// System.out.println(length);
// System.out.println(letter);
// System.out.println(index);
// System.out.println(lastIndex);



//======================================================
// MORE USEFUL STRING METHODS
//======================================================

// String name = "      Harshit Sharma       ";
//
// String name1 = name.toUpperCase(); // Converts all characters into uppercase.
//
// String name2 = name.toLowerCase(); // Converts all characters into lowercase.
//
// String name3 = name.trim(); // Removes extra spaces from the beginning and end.
//
// String name4 = name.replace("a","z"); // Replaces all occurrences of one character/string with another.
//
// System.out.println(name1);
// System.out.println(name2);
// System.out.println(name3);
// System.out.println(name4);
//
// System.out.println(name.isEmpty()); // Returns true if the string is empty otherwise false.



//======================================================
// isEmpty() METHOD
//======================================================

// isEmpty() checks whether a string contains
// any characters or not.
//
// Returns:
// true  -> String is empty.
// false -> String contains some text.

/*
String name = "Harshit Sharma";

if(name.isEmpty()){
    System.out.println("Your name is empty.");
}
else{
    System.out.println("Hello " + name + "!");
}
*/



//======================================================
// contains() METHOD
//======================================================

// contains() checks whether a string contains
// the given character or word.
//
// Returns:
// true  -> If found.
// false -> If not found.

/*
String name = "HarshitSharma";

if(name.contains(" ")){
    System.out.println("Your name contains spaces.");
}
else{
    System.out.println("Your name doesn't contain spaces.");
}
*/



//======================================================
// equalsIgnoreCase() METHOD
//======================================================

// equalsIgnoreCase() compares two strings
// without checking uppercase or lowercase.
//
// "Password"
// "password"
// "PASSWORD"
//
// All are considered equal.

/*
String name = "Password";

if(name.equalsIgnoreCase("password")){
    System.out.println("Your name can't be password.");
}
else{
    System.out.println("Hello " + name);
}
*/



//======================================================
// SUBSTRING METHOD
//======================================================

// substring() is used to extract a part of a string.
//
// Syntax:
//
// string.substring(startIndex)
// string.substring(startIndex, endIndex)
//
// Note:
// The ending index is exclusive (not included).

// String email = "harshit2676jpr@gmail.com";
//
// String username = email.substring(0,14); // Extracts username.
//
// String domain = email.substring(15,24); // Extracts domain.
//
// System.out.println(username);
// System.out.println(domain);



//======================================================
// FLEXIBLE EMAIL PARSER PROJECT
//======================================================

// Instead of manually writing indexes,
// we can use indexOf("@").
//
// This makes the program work for
// almost every email length.

// Scanner scanner = new Scanner(System.in);
//
// String email;
// String username;
// String domain;
//
// System.out.print("Enter your E-mail address : ");
// email = scanner.nextLine();
//
// if(email.contains("@")){
//
//     username = email.substring(0, email.indexOf("@"));
//
//     domain = email.substring(email.indexOf("@") + 1);
//     // +1 is used so that '@' is not included.
//
//     System.out.println("Username : " + username);
//     System.out.println("Domain : " + domain);
// }
// else{
//
//     System.out.println("E-mail must contain @");
// }
//
// scanner.close();



//======================================================
// TERNARY OPERATOR
//======================================================

// Ternary Operator is a shortcut for
// simple if-else statements.
//
// Syntax:
//
// variable = (condition) ? ifTrue : ifFalse;

// int number = 4;
//
// String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
//
// System.out.println(evenOrOdd);



//======================================================
// ENHANCED SWITCH (Java 14+)
//======================================================

// Enhanced switch is a cleaner and shorter
// replacement for multiple else-if statements.
//
// It uses -> instead of break.

// Scanner scanner = new Scanner(System.in);
//
// System.out.print("Enter the day of the week : ");
//
// String enterDay = scanner.nextLine();
//
// String day = enterDay.toLowerCase();
//
// switch(day){
//
//     case "monday",
//          "tuesday",
//          "wednesday",
//          "thursday",
//          "friday"
//          -> System.out.println("It is a Weekday 😭😭");
//
//     case "saturday",
//          "sunday"
//          -> System.out.println("It is a Weekend 😎😎");
//
//     default
//          -> System.out.println(day + " is not a valid day.");
// }
//
// scanner.close();



//======================================================
// TRADITIONAL SWITCH
//======================================================

// Before Java 14, switch statements were
// written using break after every case.

// switch(day){
//
//     case "monday":
//         System.out.println("It is a Weekday.");
//         break;
//
//     case "tuesday":
//         System.out.println("It is a Weekday.");
//         break;
//
//     case "wednesday":
//         System.out.println("It is a Weekday.");
//         break;
//
//     case "thursday":
//         System.out.println("It is a Weekday.");
//         break;
//
//     case "friday":
//         System.out.println("It is a Weekday.");
//         break;
//
//     case "saturday":
//         System.out.println("It is a Weekend.");
//         break;
//
//     case "sunday":
//         System.out.println("It is a Weekend.");
//         break;
//
//     default:
//         System.out.println(day + " is not a valid day.");
// }



//======================================================
// WHAT I LEARNED
//======================================================

// ✔ Common String Methods
// ✔ length()
// ✔ charAt()
// ✔ indexOf()
// ✔ lastIndexOf()
// ✔ toUpperCase()
// ✔ toLowerCase()
// ✔ trim()
// ✔ replace()
// ✔ isEmpty()
// ✔ contains()
// ✔ equalsIgnoreCase()
// ✔ substring()
// ✔ Email Parsing Project
// ✔ Ternary Operator
// ✔ Enhanced Switch Statement
    }
}
