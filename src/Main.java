public class Main {

    public static void main(String[] args) {
        // test values
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";
        // method calls
        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
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
}
