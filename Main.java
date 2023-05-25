import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LaptopInfo model = new LaptopInfo();
        HashSet<TypeModel> data = dataModel.set;
 
        for (TypeModel item : data){
         System.out.println(item.manufacture);
        }
         List<String> operations = fetchOperations();   
        
         HashSet<TypeModel> sortedData = Constructions.filterAllData(data, operations);
         for (TypeModel item : sortedData){
             item.printDescr();
         }
    }

    private static LaptopInfo LaptopInfo() {
    return null;
    }

    static private List<String> fetchOperations(){
        List<String> operationsArr = new ArrayList<>();
        Boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("для сортировки по производителю введите        1  ");
            System.out.println("для сортировки по объему памяти введите        2  ");
            System.out.println("для сортировки по размеру экрана               3  ");
            System.out.println("для сортировки по году выпуска                 4  ");
            System.out.println("для сортировки по объему SSD                   5  ");
            System.out.println("для выхода введите                             e  ");

            System.out.println("Введите код операции:  ");
            String userText = sc.nextLine();
            if (userText.equals("e")) {
                flag = false;
                return operationsArr;
            } else {
                operationsArr.add(userText);
            }
        }

        return operationsArr;
    }
}

