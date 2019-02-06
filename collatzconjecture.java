import java.util.Scanner;
public class collatzconjecture {
    //variables that can be accessed by all methods in the program

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        int num = -1;
        while (!(num >= 0)) {
            System.out.println("Enter a positive integer");
            num = scan1.nextInt();

            if (num < 0) {
                System.out.println("ERROR: Integer is not positive");
            }
        }

        boolean finished = false;
        int steps = 0;
        while (finished == false) {
            if (num == 1) {
                System.out.print(num + "\n");
                finished = true;
            } else {
                System.out.print(num + " --> ");
                num = arithmatic(num);
                steps++;
            }
        }

        System.out.println("Amount of steps: " + steps);
    }

    public static int arithmatic(int num) {
        int returnThisNigger = num;

        if (returnThisNigger % 2 == 0) {
            returnThisNigger /= 2;
        } else {
            returnThisNigger = (returnThisNigger * 3) + 1;
        }

        return returnThisNigger;
    }
}
