/**
 * program
 */
// import java.util.Scanner;
// public class program {

//     public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Введите высоту");
//        int h = myScanner.nextInt();
//        System.out.println("подъем за день");
//        int a = myScanner.nextInt();
//        System.out.println("на сколько метров опустилась за ночь");
//        int b = myScanner.nextInt();
//        System.out.println(getlen(args, h, a, b));
//     }
//     static Integer getlen(Object arg, int h, int a, int b){
//         int count = 0;
//         int sum = 0;
//         while (sum < h){
//             count++;
//             sum += a;
//             if (sum>= h){break;}else 
//             {sum -= b;} 
//         }
//         return count;
//     }
// }

// // Task_1Улитка ползёт по вертикальному шесту высотой h метров, 
// поднимаясь за день на a метров, а за ночь спускаясь на b метров.
//  На какой день улитка доползёт до вершины шеста?Программа получает на вход натуральные числа h, a, b.
//   Гарантируется, что a>b.Программа должна вывести одно натуральное число.
//   Sample Input 1:1032Sample Output 1:8class MyProgram{public static void main(String[] args){}}





// Task_2Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками
//  (то есть разломить шоколадку на два прямоугольника).Входные данныеВводятся 3 числа: n, m и k; k не равно n × m.
//   Гарантируется, что количество долек в шоколадке не превосходит 30000.Выходные данныеПрограмма должна вывести слово YES, если возможно отломить указанное число долек,
//    в противном случае вывести слово NO.Sample Input 1:3 2 4Sample Output 1:YESimport java.util.Scanner;class MyProgram{public static void main(String[] args){}}

//     public static void main(String[] args) {
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("Введите количество долек по высоте");
//         int chocolateH = myScanner.nextInt();
//         System.out.println("Введите количество долек по ширине");
//         int chocolateL = myScanner.nextInt();
//         System.out.println("Введите количество долек, которые надо отломить");
//         int chocolateQ = myScanner.nextInt();
//         result(args, chocolateH, chocolateL, chocolateQ);
//     } 
//     static void result(Object[] args,int chocolateH, int chocolateL, int chocolateQ){
//         int sqareChoco = chocolateL * chocolateH;
//         if (chocolateQ < sqareChoco & chocolateQ % chocolateL == 0 | chocolateQ % chocolateH == 0){
//             System.out.println("отламывай смело");}
//         else{
//             System.out.println("Не катит, попробуй другой кусок");
//         }
//     }
// }

// Task_3
// В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
// Входные данные
// Программа получает на вход действительные числа x и y
// Выходные данные
// Программа должна вывести одно натуральное число.
// Sample Input:
// 10
// 20
// Sample Output:
// 9

//     public static void main(String[] args){
//         System.out.println(findDay());
//     }
//     static Integer findDay(){
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("Введите количество километров X");
//         float x = myScanner.nextInt();
//         System.out.println("Введите количество километров У");
//         int y = myScanner.nextInt();
//         int day = 1;
//         while (x < y) {
//             x = x + ((x/100)*10);   
//             day++;
            
//         }
//         return day;
//     }
// }

// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится 
// * цифра. Определите индексы первого и последнего её вхождения.
// Sample Input 1:
//  * 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
//  * 4
//  * Sample Output 1:
//  * 0
//  * 28
//  * 
// import java.util.Scanner;
// public class program {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter string:   ");
//         String userStr = sc.nextLine();
//         System.out.println("enter num?:   ");
//         String userNum = sc.nextLine();
//         userStr = userStr.replace(" ", "");
//         System.out.println("first index userNum = " + userStr.indexOf(userNum));
//         System.out.println("last index userNum = " + userStr.lastIndexOf(userNum));
//     }
// }
// Task_2
// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, 
// в которой перечислены слова, которые написаны в газете.
// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.

// import java.util.Objects;
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Введите любимую букву Маши: ");
//         String mashaLetter = iScanner.nextLine();
//         System.out.print("Введите любимую букву Олега: ");
//         String olegLetter = iScanner.nextLine();
//         System.out.print("Введите слова из газеты: ");
//         String words = iScanner.nextLine();

//         int mashaCount = 0;
//         int olegCount = 0;
    

//         for (String word : words.split(" ")) {
//             boolean mashaFound = false;
//             boolean olegFound = false;
//             for (String letter : word.split("")) {
//                 if (Objects.equals(mashaLetter, letter) && !mashaFound) {
//                     mashaFound = true;
//                     mashaCount++;
//                 }
//                 if (Objects.equals(olegLetter, letter) && !olegFound) {
//                     olegFound = true;
//                     olegCount++;
//                 }
//             }
//         }
//         System.out.println(mashaCount);
//         System.out.println(olegCount);
//     }
// }

// import java.util.Objects;
// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.print("Введите любимую букву Маши: ");
//         String mashaLetter = iScanner.nextLine().toLowerCase();
//         System.out.print("Введите любимую букву Олега: ");
//         String olegLetter = iScanner.nextLine().toLowerCase();
//         System.out.print("Введите слова из газеты: ");
//         String words = iScanner.nextLine();

//         int mashaCount = 0;
//         int olegCount = 0;

//         for (String word : words.split(" ")) {
//             boolean mashaFound = false;
//             boolean olegFound = false;
//             for (String letter: word.split("")) {
//                 if (Objects.equals(mashaLetter, letter.toLowerCase()) && !(mashaFound)) {
//                     mashaFound = true;
//                     mashaCount++;
//                 }
//                 if (Objects.equals(olegLetter, letter.toLowerCase()) && !(olegFound)) {
//                     olegFound = true;
//                     olegCount++;
//                 }
//             }
//         }
//         System.out.println(mashaCount);
//         System.out.println(olegCount);
//     }
// }

// Task_3
// Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел 
// в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:

// 127.0.0.0
// 192.168.0.01
// 255.00.255.255

// Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:
// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.
// String s = "\.";
// Sample Input 1:
// 192.168.1.2
// Sample Output 1:
// YES
// Sample Input 2:
// 192.11.690.0
// Sample Output 2:
// NO
// Sample Input 3:
// 67.67.67
// Sample Output 3:
// NO



// import java.util.Objects;
// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter IP:   ");
//         String userStr = sc.nextLine();
//         String[] ipNum = userStr.split("\\.");
//         boolean res = true;
//         if (ipNum.length != 4) {
//             res = false;
//         } else {
//             for (int i = 0; i < ipNum.length; i++) {
//                 int num = Integer.parseInt(ipNum[i]);
//                 if (num >= 0 && num <= 255) {

//                 } else {
//                     res = false;
//                     break;
//                 }
//             }
//         }
//         if (res == true) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }

// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. 
// Найдите, сколько раз в тексте встречается введённый символ в любом регистре.
//  Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.


// import java.util.Objects;
// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter text:  ");
//         String userText = sc.nextLine().toLowerCase();
//         System.out.println("enter char:  ");
//         String userChr = sc.nextLine().toLowerCase();
//         String[] textArr = userText.split("");
//         int count = 0;
//         for (int i = 0; i < textArr.length; i++) {
//             if (textArr[i].equals(userChr)) {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// Вводится строка, определите, каких символов в ней больше: цифр или букв? 
// Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. 
// Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". 
// Если же их равное количество, то выведите слово "Equal".

import java.util.Objects;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text :   ");
        String userText = sc.nextLine();
        int countDig = 0;
        int countLet = 0;

        char[] textArr = userText.toCharArray();
        for (int i = 0; i < textArr.length; i++) {
            if (Character.isDigit(textArr[i])) {
                countDig++;
            } else if (Character.isLetter(textArr[i])) {
                countLet++;
            }
        }

        if (countDig > countLet) {
            System.out.println("digit!!! " + countDig);
        } else {
            System.out.println("Letter!!! " + countLet);
        }
    }
}