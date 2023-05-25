import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LaptopInfo {
    public HashSet<TypeModel> set;

    LaptopInfo(){
        this.set = LaptopInfo.getData();
    }

    static HashSet<TypeModel> getData(){
        HashSet<TypeModel> res = new HashSet<>();
        res.add(new TypeModel("LG", "ultrabook", 16, "Gray", 13.0, 2018, 256));
        res.add(new TypeModel("Samsung", "top", 16, "Black", 15.0, 2019, 512));
        res.add(new TypeModel("Xiaomi", "exzemption", 8, "Gray", 15.5, 2020, 512));
        res.add(new TypeModel("Acer", "Nitro", 16, "Black", 15.6, 2021, 512));
        res.add(new TypeModel("HP", "Montana", 16, "Black", 15.6, 2022, 1024));
        return res;
    }
}