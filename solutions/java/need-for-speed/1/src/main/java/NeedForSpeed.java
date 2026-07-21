class NeedForSpeed {
    protected int speed;
    protected int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
    }

    public boolean batteryDrained() {
        if(battery < batteryDrain){
            return true;
        }else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        return distanceDriven;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
        if(battery >= batteryDrain){
            distanceDriven += speed;
            battery -= batteryDrain;
        }
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
        //throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if(100/car.batteryDrain * car.speed >= distance){
            return true;
        }else {
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
    }
}
