public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int ovenMin){
        return expectedMinutesInOven() - ovenMin;
    }

    public static int preparationTimeInMinutes(int layer){
        return layer * 2;
    }
    
    public static int totalTimeInMinutes(int layer, int ovenMin){
        return preparationTimeInMinutes(layer) + ovenMin;
    }
    
}
