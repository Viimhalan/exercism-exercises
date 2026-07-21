public class ExperimentalRemoteControlCar implements RemoteControlCar{

    int distanceTravelled = 0;
    
    public void drive() {
        distanceTravelled += 20;
        //throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.drive() method");
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
        //throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
    }
}
