# Java Control Flow Workshop

## Learning Objectives
- Use conditional statements to control the logical flow of an application
- Understand and use if statements, if-else, if-else-if-else etc
- Understand and use switch statements
- Ternary Operators in Java

## Conditional Statements

Like most programming languages, Java uses conditionals and tests which generate them to decide which bits of code to run.

Start by just creating a Main class in the com.booleanuk package inside src as normal and adding the following code to it:

```java
package com.booleanuk;

public class Main {
    String name = "Dave";
    int score = 95;

    public static void main(String[] args) {
        Main theMain = new Main();
        if (theMain.name.equals("Dave")) {
            System.out.println("Hello " + theMain.name + ". How are you feeling?");
        }
    }
}
```

What will it do when you run it?

Unlike other types of value, `Strings` can only be compared by using the `.equals()` method. We can check if the `score` variable is equal to 95 by using `==` instead. So we could change the above code to something like:
```java
package com.booleanuk;

public class Main {
    String name = "Dave";
    int score = 95;

    public static void main(String[] args) {
        Main theMain = new Main();
        if (theMain.score == 95) {
            System.out.println("Hello " + theMain.name + ". You scored: " + theMain.score);
        }
    }
}
```

And it would work as expected.

We can use `<`, `>`, `<=` and `>=` to compare numbers in various ways. 

We can test multiple values with only the first one that evaluates as true being run as follows (this is very similar to the way things are done in JavaScript).

```java
package com.booleanuk;

public class Main {
    String name = "Dave";
    int score = 0;

    public static void main(String[] args) {
        Main theMain = new Main();
        if (theMain.score > 90) {
            System.out.println("Hello " + theMain.name + ". Your score is awesome!");
        } else if (theMain.score > 60) {
            System.out.println("Hello " + theMain.name + ". Your score is great!");            
        } else if (theMain.score > 30) {
            System.out.println("Hello " + theMain.name + ". Your score is okay!");
        } else {
            System.out.println("Hello " + theMain.name + ". We need to talk about your score!");
        }
    }
}
```

## Activity

Recreate something similar but to test whether a person is old enough to drive (I'll use the UK rules) and output a suitable message each time.
- Under 16 they can't drive.
- 16+ they can ride a low-powered motorbike/moped.
- 17+ they can learn to drive a car or other vehicle.
- 70+ Must reapply for a driving license every 2 years.

## Switch statements

A switch statement in Java is a simplified version of the if-else-if-else-if-else pattern above, but it is limited in what can be tested. It may let us achieve a similar outcome whilst reducing the amount of code we write but not always. One thing to bear in mind is that we can't cover a range of values in the same way we did above easily, instead it works on single values being compared.

Let's do an example using score again

```java
package com.booleanuk;

public class Main {
    String name = "Dave";
    int score = 4;

    public static void main(String[] args) {
        Main theMain = new Main();
        
        switch(theMain.score) {
            case 0:
                System.out.println("Unlucky.");
                break;
            case 1:
                System.out.println("You scored 1, you can do better.");
                break;
            case 2:
                System.out.println("You scored 2, not bad.");
                break;
            case 3:
                System.out.println("You scored 3, a good start.");
                break;
            case 4:
                System.out.println("You scored 4, pretty good.");
                break;
            case 5:
                System.out.println("You scored 5, excellent.");
                break;
            default: 
                System.out.println("Your score was invalid.");
        }
    }
}
```

A common error is to omit the `break;` statement which will cause multiple cases to run.

## Enhanced Switch Statements

If you are using Java 13 or newer (as we are) then we can replace the `Switch` statement above with an `Enhanced Switch` statement. IntelliJ will offer to do this for you, click on the yellow light bulb and select this to see it in action.

## Activity

Create a switch statement which tests a String to see what month it is, and outputs a nicely formatted string with the number of days in the month, you can use an `Enhanced Switch` statement if you prefer.

## Ternary Statements

In place of an if-else statement, if we are looking to assign a value to a variable that is different depending on the outcome of a simple test then we can replace it with a `Ternary Statement` for instance we can replace the if statement here:

```java
package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        int score = 10;
        String grade = "";
        if (score > 5) {
            grade = "A";
        } else {
            grade = "B";
        }
    }
}
```

With the following:

```java
package com.booleanuk;

public class Main {
    public static void main(String[] args) {
        int score = 10;
        String grade = score > 5 ? "A" : "B";
    }
}
```

This can however be difficult to read, when the code to the right of the equals becomes more complex. Although in theory the two possible values could be function calls which return the value desired.

## Activity

By combining the various if statements, switch statements and ternary operators create a program which has a method which determines the number of days in the month given the year and month as arguments to the method and returns the number of days accordingly.

## Checking User Input

Imagine you are building a quiz machine that asks the user a question then provides them with a selection of possible answers. The user enters their answer and then the program returns feedback based on whether they got the question correct or not.

Sample Quiz Question
```
What is the meaning of Life, the Universe and Everything?
A. 23
B. 0
C. 42
D. -1
Enter your answer A, B, C or D: C
Well done! You are correct.
```

One version of such a quiz machine might look like this:

```java
package com.booleanuk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the meaning of Life, the Universe and Everything?");
        System.out.println();
        System.out.println("A. 23");
        System.out.println("B. 0");
        System.out.println("C. 42");
        System.out.println("D. -1");
        System.out.println("Enter your answer A, B, C or D");

        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice.equals("C")) {
            System.out.println("Well done! You got the right answer.");
        } else if (choice.equals("A") || choice.equals("B") || choice.equals("D")) {
            System.out.println("Unlucky! Better luck next time.");
        } else {
            System.out.println("That wasn't a valid choice.");
        }
    }
}
```

`Scanner input = new Scanner(System.in);` sets up the variable `input` to read values from the terminal that can then be used inside your program. Here we take the input and convert it to upper case before testing it and outputting the result.

## Activity 

Write your own quiz machine that asks multiple questions in a similar way that this one does.

Rewrite your quiz so that the parts are housed in member variables in a QuizQuestion class that also has methods that are called in order to achieve the same outcome as the above code.







## Set up instructions
- Fork this repository and clone the forked version to your machine
- Open the root directory of the project in IntelliJ
- Implement the requirements listed in comments in the `./src/main/java/com.booleanuk/core/Exercise.java` file
- When ready to test your solution, open the `./src/test/java/com.booleanuk/core/ExerciseTest.java` file and click a "Run Test" button. You can either run the entire test suite via figure 1 in the screenshot below, or run a specific test via figure 2.

![](./assets/run-a-test.PNG)

## Test Output

When you run a test, it's either going to pass or fail. When it fails, you'll be presented with a big red stream of text. This is called a stack trace and, though intimidating, does contain some useful information.

One of the core skills of a developer is debugging stack traces like this. The stack trace details in which classes & files the failure happened, and gives you a line number at the end. Most of the lines in the stack trace are irrelevant most of the time, you want to try and identify the files that you're actually working with.

In the sample screenshot below, we've tried to complete the first step of the exercise but provided an invalid value. Then we run the test associated with it, and we see a big red stack trace, a test failure.

At the top, we see `expected: <32> but was: <33>`. This means the test expected the value to be 32, but the value the student provided was 33. We can see this in the code snippets at the top of the screenshot.

In the stack trace itself, we see this line: `at app//com.booleanuk.core.ExerciseTest.shouldBeAged32(ExerciseTest.java:20)`. This is helpful! This tells us the exact line in the ExerciseTest.java file (line 20) where the failure happened, as well as the method name (shouldBeAged32), helping us to identify where the issue began. This is the kind of thing you need to look for; a relevant file name, method name, class name and line number to give you a good starting point for debugging.

![](./assets/test-failure.PNG)
