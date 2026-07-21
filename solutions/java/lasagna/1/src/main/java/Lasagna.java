public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int ovenMin){
        return 40 - ovenMin;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layer){
        return layer * 2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int layer, int ovenMin){
        return layer * 2 + ovenMin;
    }
    
}
