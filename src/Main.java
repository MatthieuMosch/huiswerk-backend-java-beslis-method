public class Main {

    public static void main(String[] args) {
        // test values
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        int year = 1974;
        char operator = '/';
        String name = "Henk";
        String someText = "lorem ipsum dolor sit amet";
        // method calls
        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
        // bonus ifelse
        evenOrOdd(number);
        System.out.println(number + " equals grade " + grade(number));
        System.out.println(greatest(input1, input2) + " is the greatest of " + input1 + " and " + input2);
        System.out.println("Someone who is " + number + " years old is a " + ageClass(input2) + ".");
        checkLength(someText);
        if (leapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        System.out.println(greatest(input1, input2, year) + " is the greatest of "
                + input1 + " and " + input2 + " and " + year);
        System.out.print("a triagle with sides of " + 12 + " and " + 24 + " and " + 12 + " is called ");
        System.out.println(triangleType(12,24,12));
        System.out.println(input1 + " " + operator + " " + input2 + " = "
                + calculator(input1,input2, operator));
        //bonus loops
        System.out.println("Sum to 100 = " + sumTo(100));
        printPowersOf(2);
        printPrimes(100);
        printFibonacci(10);
        printTree(5);
    }

    private static void hello() {
        System.out.println("Hello world!");
    }

    private static void positiveOrNegative(int number) {
        if (number < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is positive!");
        }
    }

    private static void positiveOrZeroOrNegative(int number) {
        if (number < 0) {
            System.out.println("This number is negative");
        } else if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is zero!");
        }
    }

    private static void bartender(String name) {
        String drink = "blood";
        switch (name) {
            case "Henk":
                drink = "beer";
                break;
            case "Nova":
                drink = "banana juice";
                break;
            case "Matthieu":
                drink = "milk";
                break;
            default:
                name += " is not a real person and probably";
        }
        System.out.println(name + " likes to drink " + drink + "!" );
    }

    private static void sum(int input1, int input2) {
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
    }

    // bonus ifelse

    private static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    private static char grade(int number) {
        if (number < 6) {
            return 'F';
        } else if (number < 7) {
            return 'D';
        } else if (number < 8) {
            return 'C';
        } else if (number < 9) {
            return 'B';
        } else if (number <= 10) {
            return 'A';
        } else {
            return 'X';
        }
    }

    private static int greatest(int input1, int input2) {
        if (input1 > input2) {
            return input1;
        } else {
            return input2;
        }
    }

    private static int greatest(int input1, int input2, int input3) {
        if (input1 > input2 && input1 > input3) {
            return input1;
        } else if (input2 > input3) {
            return input2;
        } else {
            return input3;
        }
    }

    // opdracht 4 already done with method positiveOrZeroOrNegative()

    private static String ageClass(int age) {
        if (age < 10) {
            return "child";
        } else if (age < 19) {
            return "adolescent";
        } else if (age < 65) {
            return "adult";
        } else {
            return "senior";
        }
    }

    private static void checkLength(String text) {
        if (text.length() < 10) {
            System.out.println("This is a short text");
        } else if (text.length() < 20) {
            System.out.println("This is a text of average length");
        } else {
            System.out.println("This is a long text");
        }
    }

    private static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String triangleType(int length1, int length2, int length3) {
        if (length1 == length2 && length1 == length3) {
            return "gelijkzijdig";
        } else if (length1 == length2 || length1 == length3 || length2 == length3) {
            return "gelijkbenig";
        } else {
            return "ongelijkzijdig";
        }
    }

    private static float calculator(float input1, float input2, char operator) {
        if (operator == '+') {
            return input1 + input2;
        } else if (operator == '-') {
            return input1 - input2;
        } else if (operator == '*') {
            return input1 * input2;
        } else if (operator == '/') {
            return input1 / input2;
        } else {
            System.out.println(operator + " is not a valid operator.");
            return 0;
        }
    }

    // bonus loops

    // antwoord 1 : for loop
    private static int sumTo(int number) {
        // calculate the sum of all numbers from 1 to number including number
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    // antwoord 2 : do-while loop
    private static void printPowersOf(int number) {
        System.out.println("Powers of " + number);
        int result = 1;
        System.out.print(result);
        result *= number;
        while (result < 1000) {
            System.out.print("," + result);
            result *= number;
        }
        System.out.println("");
    }

    // antwoord 3 : for loop tot lengte van de lijst en als gevonden boolean op true zetten en break

    // antwoord 4 : for loop tot array.length

    // antwoord 5 : for loop tot lengte van de lijst en break als lege string gevonden

    // antwoord 6 : for loop tot 100 en een for loop tot en met de wortel van het getal
    private static void printPrimes(int number) {
        System.out.println("All prime numbers to " + number);
        System.out.print("1");
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.print("," + i);
            }
        }
        System.out.println("");
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // antwoord 7 : for loop tot lengte van de lijst met if (i>45) {}

    // antwoord 8 : for loop : for (int i = 10; i > 0; i--) {}

    // antwoord 9 : for loop
    private static void printFibonacci(int number) {
        int a = 0;
        int b = 1;
        System.out.println("the first " + number + " fibonacci numbers are: ");
        System.out.print(a);
        for (int i = 2; i <= number; i++) {
            System.out.print("," + b);
            b = a + b;
            a = b - a;
        }
        System.out.println("");
    }

    // antwoord 10 : for loop
    private static void printTree(int rows) {
        for (int i = 1; i <= rows; i++) {
            System.out.print(" ".repeat(rows-i));
            System.out.println("*".repeat(i*2-1));
        }
    }
}
