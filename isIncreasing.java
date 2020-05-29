import java.util.Scanner;

public class isIncreasing {

    public static void main (String[] args) {

        // declare scanner
        Scanner input = new Scanner(System.in);

        // make the list of values
        int[] values = new int[5];

        System.out.println("Please enter 5 integers");

        // loop to let user input integers
        for (int i = 0; i < 5; i ++) {

            int numbers = input.nextInt();

            values[i] = numbers;
        }

        // send list to the method
        boolean result = isIncreasing(values);

        // if method returns false then numbers aren't increasing
        if (result == false) {

            System.out.println("Those numbers are not in increasing order");
        }

        // otherwise the numbers are increasing
        else {

            System.out.println("Those numbers are in increasing order");
        }

    }

    public static boolean isIncreasing(int[] values) {

        // loop for the amount of the length of the list minus 1 to stay in bounds
        for (int i = 0; i < values.length - 1; i ++) {

            // if the previous number is bigger than the next, or they're the same, then they're not increasing
            if ((values[i] > values[i+1]) || (values[i] == values[i + 1])) {

                return false;
            }
        }

        // otherwise return true
        return true;
    }
}

