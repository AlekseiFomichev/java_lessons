
// Task_0
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

// Task_1
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// // Напишите программу, которая перетасует символы в S таким образом,
// // что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// //
// // Пример: s = “cba”, index = [3,2,1] result “abc”
// public String findJewelsInStones(String jewels, String stones) {
// return "";

// Task_2
// На первой строке записывается натуральное число n - количество строчек в книге. 
// Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, 
// на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт,
// на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. 
// Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте 
// внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна 
// начинаться с большой буквы!
// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. 
// Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. 
// Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.


import java.util.Arrays;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        //preciousStones();
        //shuffleArrIndex();
        replacingIngredients();


    }

    //task_0 func
    static void preciousStones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter search text:   ");
        char[] userSearch = sc.nextLine().toCharArray();
        System.out.println("enter text:   ");
        String userText = sc.nextLine();
        String resStr = "";
        for(int i = 0; i < userSearch.length; i++){
            resStr += String.valueOf(userSearch[i]) + countSubStrInStr(userText, String.valueOf(userSearch[i]));
        }
        System.out.println(resStr);
    }

    static int countSubStrInStr(String str, String target){
        int res = str.length() - str.replace(target, "").length();

        return res;
    }

    //task_1 func 
    static void shuffleArrIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:    ");
        String[] userText = sc.nextLine().split("");
        System.out.println(Arrays.toString(userText));
        System.out.println("enter arr index(числа через пробел):    ");

        String[] userIndex = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(userIndex));

        String[] res = new String[userText.length];
        for(int i = 0; i < userIndex.length; i++){
            res[Integer.parseInt(userIndex[i]) - 1] = userText[i];
        }
        String result = String.join("", res);
        System.out.println(result);
    }

    //task_2 func 
    static void replacingIngredients(){
        Scanner sc = new Scanner(System.in);
        int n = stringToInt();

        String[] recipes = new String[n];

        for(int i = 0; i < n; i++){
            System.out.println("enter recipes:   ");;
            recipes[i] = sc.nextLine();
        }
        int m = stringToInt();
        String[] replProd = new String[m];
        for(int i = 0; i < m; i++){
            System.out.println("enter product(form prod1 - prod2):   ");
            replProd[i] = sc.nextLine();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                String[] repElement = replProd[j].split(" - ");
                recipes[i] = recipes[i].replace(repElement[0], repElement[1]);
            }
            System.out.println(recipes[i]);
        }
        

    }



    //проверка на ввод int
    static int stringToInt(){
        int resultValue = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter digit:  ");
        String userText = sc.nextLine();
        boolean isDigit;
        try{
            Integer.parseInt(userText);
            resultValue = Integer.parseInt(userText);
            isDigit = true;
        } catch(NumberFormatException e){
            isDigit = false;
            while(!isDigit){
                System.out.print("повторите:    ");
                userText = sc.nextLine();
                try{
                    Integer.parseInt(userText);
                    resultValue = Integer.parseInt(userText);
                    isDigit = true;
                }catch(NumberFormatException s){

                }
            }
        }
        return resultValue;
    }


}