class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    
    int distanceTravelled = 0;
    int victories;

    public void drive() {
        distanceTravelled += 10;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.drive() method");
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getDistanceTravelled() method");
    }

    public int getNumberOfVictories() {
        return victories;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
    
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(this.victories, other.victories);
    }
}
