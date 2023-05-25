
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.swing.text.html.StyleSheet.BoxPainter;

public class Constructions {
    

private static HashSet<TypeModel> sortDataManuf(HashSet<TypeModel> dataSet){
    HashSet<TypeModel> result = new HashSet<>();
    String man = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("выберите производителя:  ");
    String userText = sc.nextLine().toLowerCase();
    System.out.println("ищу " + userText);

    for (TypeModel item : dataSet){
        if ((item.manufacture.toLowerCase()).equals(userText)){
            result.add(item);

        }
    }
    return result;
}



private static HashSet<TypeModel> sortDataMemory(HashSet<TypeModel> dataSet){
    HashSet<TypeModel> result = new HashSet<>();
    String price = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("выберите минимальный объем памяти :  ");
    String userText = sc.nextLine();

    System.out.print("выберите максимальный объем памяти:  ");
    String userText2 = sc.nextLine();

    for (TypeModel item : dataSet){
        if (item.memoryValue >= Integer.parseInt(userText) && item.memoryValue <= Integer.parseInt(userText2)){
            result.add(item);
        }
    }

    return result;
}


private static HashSet<TypeModel> sortDataScreenSize(HashSet<TypeModel> dataSet){
    HashSet<TypeModel> result = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("выберите диагональ экрана от:  ");
    String userScr = sc.nextLine();
    System.out.print("выберите диагональ экрана до:  ");
    String userScr2 = sc.nextLine();

    for (TypeModel item : dataSet){
        if (item.screenSize >= Double.parseDouble(userScr)  && item.screenSize <= Double.parseDouble(userScr2)){
            result.add(item);
        }
    }
    return result;
}




static private HashSet<TypeModel> sortDataYear(HashSet<TypeModel> dataSet){
    HashSet<TypeModel> result = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("минимальный год производства:   ");
    String userText1 = sc.nextLine();
    System.out.println("максимальный год производства:   ");
    String userText2 = sc.nextLine();

    for (TypeModel item : dataSet){
        if (item.yearOfRelease >= Integer.parseInt(userText1) && item.yearOfRelease <= Integer.parseInt(userText2)){
            result.add(item);
        }
    }
    return result;
}



static private HashSet<TypeModel> sortDataSSD(HashSet<TypeModel> dataSet){
    HashSet<TypeModel> result = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размер SSD от:   ");
    String userText1 = sc.nextLine();
    System.out.println("Введите размер SSD до:   ");
    String userText2 = sc.nextLine();

    for (TypeModel item : dataSet){
        if (item.ssdVolume >= Integer.parseInt(userText1) && item.ssdVolume <= Integer.parseInt(userText2)){
            result.add(item);
        }
    }
    return result;
}


static HashSet<TypeModel> filterAllData(HashSet<TypeModel> data, List<String> codeUserOperation){
    HashSet<TypeModel> result = data;
    for(String code: codeUserOperation){
        switch(code){
            case ("1"):
            result = sortDataManuf(result);
            break;

            case ("2"):
            result = sortDataPrice(result);
            break;

            case ("3"):
            result = sortDataMemory(result);
            break;

            case ("4"):
            result = sortDataOS(result);
            break;

            case ("5"):
            result = sortDataScreenSize(result);
            break;

            case ("6"):
            result = sortDataYear(result);
            break;

            case ("7"):
            result = sortDataSSD(result);
            break;
        }
    }
    if (result.isEmpty()){
        System.out.println("ничего не обнаружено");
    }
    return result;
    }
}
