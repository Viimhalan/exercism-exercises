public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prod = 0;
        if(speed <= 4 && speed >= 1){
            prod = speed * 221;
        }
        else if(speed <= 8 && speed >= 5){
            prod = speed * 221 * 0.9;
        }
        else if(speed == 9){
            prod = speed * 221 * 0.8;
        }
        else if(speed == 10){
            prod = speed * 221 * 0.77;
        }
        return prod;
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        double prod = 0;
        if(speed <= 4 && speed >= 1){
            prod = (speed * 221) / 60 ;
        }
        else if(speed <= 8 && speed >= 5){
            prod = (speed * 221 * 0.9) / 60;
        }
        else if(speed == 9){
            prod = (speed * 221 * 0.8) / 60;
        }
        else if(speed == 10){
            prod = (speed * 221 * 0.77) / 60;
        }
        return (int)prod;
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
