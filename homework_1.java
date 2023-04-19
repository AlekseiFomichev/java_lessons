// Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
// Вывести все простые числа от 1 до 1000



// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить


import java.util.Objects;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        // task_1

        // int n = func.stringToInt();
        // System.out.println(triangNumbers(n).intValue());

        //task_2

        // simpleNumbers(1, 1000);

        // // task_3

        // Scanner sc = new Scanner(System.in);
        // int a = func.stringToInt();
        // int b = func.stringToInt();
        // System.out.println("enter operation: ");
        // String op = sc.nextLine();
        // System.out.println(calc(a, b, op));

        // //task_4

        // smartCalc("5?", "1?", "6?");

        // // task_6

        // sumElArEvenIndex();

        // // task_7

        notRepEl();

    }

    // task_1 func

    // static Double triangNumbers(int number) {
    //     double res = 0.5 * number * (number + 1);
    //     return res;
    // }

    // // task_2 func

    // static void simpleNumbers(int startNumber, int endNumber) {
    //     for (int i = startNumber; i <= endNumber; i++) {
    //         int count = 0;
    //         for (int j = 1; j <= i; j++) {
    //             if (i % j == 0) {
    //                 count++;
    //             }
    //         }
    //         if (count == 2) {
    //             System.out.println(i);
    //             ;
    //         }
    //     }
    // }

    // // task_3 func

    // static double calc(int a, int b, String operation) {
    //     double res = 0;
    //     switch (operation) {
    //         case "+":
    //             res = a + b;
    //             break;
    //         case "-":
    //             res = a - b;
    //             break;
    //         case "*":
    //             res = a * b;
    //             break;
    //         case "/":
    //             res = a / b;
    //             break;

    //         default:
    //             System.out.println("operation could not be recognized");
    //             break;
    //     }

    //     return res;
    // }

    // // task_4

    // private static void smartCalc(String a, String b, String r) {
    //     boolean flag = false;

    //     for (int i = 0; i <= 9; i++) {
    //         for (int j = 0; j <= 9; j++) {
    //             for (int q = 0; q <= 9; q++) {
    //                 if (Integer.parseInt(a.replace("?", String.valueOf(i))) +
    //                         Integer.parseInt(b.replace("?", String.valueOf(j))) == Integer
    //                                 .parseInt(r.replace("?", String.valueOf(j)))) {
    //                     System.out.println(a.replace("?", String.valueOf(i)) + " + "
    //                             + b.replace("?", String.valueOf(j)) + " = "
    //                             + r.replace("?", String.valueOf(j)));
    //                     flag = true;
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     if (!flag) {
    //         System.out.println("no results :(");
    //     }
    // }

    // // task_6 func

    // static void sumElArEvenIndex() {
    //     int n = func.stringToInt();
    //     Integer[] arr = new Integer[n];
    //     int resSum = 0;

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = func.stringToInt();
    //         if (i % 2 == 0) {
    //             resSum += arr[i];
    //         }
    //     }

    //     System.out.println("Sum numbers(event index)  -  " + resSum);

    //     System.out.println("numbers even index: ");
    //     for (int i = 0; i < n; i = i + 2) {
    //         System.out.println(arr[i]);
    //     }
    // }

    // // task_7 func

    static void notRepEl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digits. Spacer - space :   ");
        String userStr = sc.nextLine();
        String[] arrDigits = userStr.split(" ", 0);
        for (int i = 0; i < arrDigits.length; i++) {

            int count = 0;
            for (int j = 0; j < arrDigits.length; j++) {
                if (Objects.equals(arrDigits[i], arrDigits[j])) {
                    count++;
                }
            }
            if (count <= 1) {
                System.out.println(arrDigits[i]);
            }
        }
    }

}