
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeekCount = {0,2,5,3,7,8,4};
        return lastWeekCount;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDay = false;
        for(int birds : birdsPerDay){
            if(birds == 0){
                hasDay = true;
            }
        }
        return hasDay;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalCount = 0;
        if(numberOfDays < birdsPerDay.length){
            for(int i = 0; i < numberOfDays; i++){
                totalCount += birdsPerDay[i];
            }
        }
        else if(numberOfDays >= birdsPerDay.length){
            for(int i = 0; i < birdsPerDay.length; i++){
                totalCount += birdsPerDay[i];
            }
        }
        return totalCount;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int numOfBusyDays = 0;
        for(int birds : birdsPerDay){
            if(birds >= 5){
                numOfBusyDays += 1;
            }
        }
        return numOfBusyDays;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
