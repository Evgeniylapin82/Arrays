import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] decimal = {1.57, 7.654, 9.986};
        int[] arbitraryNumber = {5, 7, 9, 11, 13, 15};

        System.out.println("Задача 2");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < decimal.length; i++) {
            System.out.print(decimal[i]);
            if (i != decimal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arbitraryNumber.length; i++) {
            System.out.print(arbitraryNumber[i]);
            if (i != arbitraryNumber.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = decimal.length - 1; i >= 0; i--) {
            System.out.print(decimal[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arbitraryNumber.length - 1;i >= 0; i--) {
            System.out.print(arbitraryNumber[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}



