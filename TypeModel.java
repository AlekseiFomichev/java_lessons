
public class TypeModel {
    String manufacture;
    String model;
    Integer memoryValue;
    String color;
    Double screenSize;
    Integer yearOfRelease;
    Integer ssdVolume;

    TypeModel(String manufacture, String model, Integer memoryValue, String color, 
                  Double screenSize, Integer yearOfRelease, Integer ssdVolume){

        this.manufacture = manufacture;
        this.model = model;
        this.memoryValue = memoryValue;
        this.color = color;
        this.screenSize = screenSize;
        this.yearOfRelease = yearOfRelease;
        this.ssdVolume = ssdVolume;
    }

    void printDescr(){
        System.out.println(manufacture + " " + model);
        System.out.println("memory: " + memoryValue + "GB");
        System.out.println();
    }
    
}

