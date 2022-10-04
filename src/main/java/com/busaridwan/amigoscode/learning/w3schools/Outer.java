package com.busaridwan.amigoscode.learning.w3schools;


import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Outer {
    public int x = 5;
    public class Inner {
        public int z = 10;
    }
    private class InnerPrivate{
        int y = 15;
    }
    static class InnerStatic{
        //Do not have access to members of Outer class
        int w = 20;
    }
}
final class Main{
    public static void main(String[] args) {
// ARRAY
        int[] primeNum = new int[5];
        primeNum[0] = 3;
        for (int x:
            primeNum ) {
            System.out.println(x);
        }
// ARRAY LIST
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.get(0);
        cars.set(0,"Opel");
        cars.remove(0);
        cars.clear();
        cars.size();

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(1);
        integers.add(9);
        Collections.sort(integers);
// Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

        // LINKED LIST

        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(8);
        num.add(7);

        /*
        addFirst()	Adds an item to the beginning of the list.
addLast()	Add an item to the end of the list
removeFirst()	Remove an item from the beginning of the list.
removeLast()	Remove an item from the end of the list
getFirst()	Get the item at the beginning of the list
getLast()	Get the item at the end of the list
         */

        // HASH MAP
        HashMap<String, String> myMap = new HashMap<>();
        // .put(), .get, .clear, .size, .remove, .keySet(), .values()
        myMap.put("Kano", "Kano");
        myMap.get("Kano");
        myMap.put("Kwara", "Ilorin");
        myMap.put("Lagos", "Ikeja");

        // LOOP HASH MAP
        for (String i:
                myMap.keySet()) {
            System.out.println("Key: "+i+" Values: "+myMap.get(i));

        }

        // HASH SET - Collection of Unique Items
        HashSet<String> set = new HashSet<>();
        set.add("Car");
        set.add("Fridge");
        set.add("Car");
        // .contains(),

        // ITERATOR - loop through Collections
        // Make a collection
        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        // Get the iterator
        Iterator<String> it = car.iterator();

        // Print the first item
        System.out.println(it.next());
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // ForLoop or ForEach won't work here has the size of the collection changes has item get removed
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);

        // WRAPPER CLASS using primitive data type as objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString() method used to convert wrapper objects to strings.
        Integer myInte = 100;
        String myString = myInte.toString();
        System.out.println(myString.length());

// EXCEPTION Try... Catch

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }

        /*The throw statement allows you to create a custom error.

The throw statement is used together with an exception type.
There are many exception types available in Java: ArithmeticException,
FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

Line 217
         */

// Regular Expression
/*
        Pattern Class - Defines a pattern (to be used in a search)
        Matcher Class - Used to search for the pattern
        PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

        Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet

[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9

|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character
\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
	Find the Unicode character specified by the hexadecimal number xxxx

n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's
                */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


        //THREAD - multiTask

       // It can be created by extending the Thread class and overriding its run() method:
//        class Main extends Thread {
//            public static void main(String[] args) {
//                Main thread = new Main();
//                thread.start();
//                System.out.println("This code is outside of the thread");
//            }
//            public void run() {
//                System.out.println("This code is running in a thread");
//            }
//        }
//        // Another way to create a thread is to implement the Runnable interface:
//         class Main implements Runnable {
//        public static void main(String[] args) {
//            Main obj = new Main();
//            Thread thread = new Thread(obj);
//            thread.start();
//            System.out.println("This code is outside of the thread");
//        }
//            public void run() {
//                System.out.println("This code is running in a thread");
//            }
//        }
        //To avoid concurrency problems, it is best to share as few attributes between threads as possible. If attributes need to be shared, one possible solution is to use the isAlive() method of the thread to check whether the thread has finished running before using any attributes that the thread can change.

//LAMBDA
        //parameter -> expression
        //(parameter1, parameter2) -> expression
        //(parameter1, parameter2) -> { code block }

        ArrayList<Integer> number = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );
/*
interface StringFunction {
  String run(String str);
}

public class Main {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }
  public static void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
 */

        File myObj = new File("filename.txt"); // Specify the filename

        /*
        canRead()	Boolean	Tests whether the file is readable or not
canWrite()	Boolean	Tests whether the file is writable or not
createNewFile()	Boolean	Creates an empty file
delete()	Boolean	Deletes a file
exists()	Boolean	Tests whether the file exists
getName()	String	Returns the name of the file
getAbsolutePath()	String	Returns the absolute pathname of the file
length()	Long	Returns the size of the file in bytes
list()	String[]	Returns an array of the files in the directory
mkdir()	Boolean	Creates a directory
         */

        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);

        Outer outer = new Outer();
        Scanner print = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String letter = print.nextLine();
        System.out.println("Welcome "+letter);


        //   TIME IN JAVA
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dayTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        // E, MMM dd yyyy
        // dd-MMM-yyyy
        // dd/MM/yyyy
        // yyyy-MM-dd
        String formatted = dayTime.format(format);
        System.out.println(time);
        System.out.println("Formatted:   "+formatted);

        for (Level var: Level.values()){
            System.out.println(var);
        }

        Level myVar = Level.HIGH;
        switch (myVar){
            case LOW:
                System.out.println("LOW");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
            default:
                System.out.println("Printing Nothing");
        }

        // Instantiating public inner class
        Outer.Inner inner = outer.new Inner();
        System.out.println(outer.x);
        System.out.println(inner.z);

        // Instantiating Static inner class
        Outer.InnerStatic myStatic = new Outer.InnerStatic();
        System.out.println(myStatic.w);

    }
}

// Interface is a completely abstract class - all methods are abstract
// Cannot be used to create objects
// Must override all methods during implementation
interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{

    public void animalSound() {
        System.out.println("Cokkkkkk");
    }


    public void sleep() {
        System.out.println("Zzz");
    }


    // THROW EXCEPTION
    static void checkAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

