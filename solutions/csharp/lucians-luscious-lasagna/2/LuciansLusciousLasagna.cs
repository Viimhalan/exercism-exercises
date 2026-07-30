class Lasagna
{
    public int ExpectedMinutesInOven(){
        return 40;
    }

    public int RemainingMinutesInOven(int min){
        return ExpectedMinutesInOven() - min;
    }

    public int PreparationTimeInMinutes(int layer){
        return layer * 2;
    }    

    public int ElapsedTimeInMinutes(int layer, int min){
        return PreparationTimeInMinutes(layer) + min;
    }    
}
