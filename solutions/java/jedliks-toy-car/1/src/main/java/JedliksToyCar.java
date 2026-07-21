public class JedliksToyCar {
    
    private int drivenMetre = 0;
    private int batteryPercent= 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
        //throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
    }

    public String distanceDisplay() {
        return "Driven " + drivenMetre + " meters";
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        return (batteryPercent > 0)? "Battery at " + batteryPercent + "%":"Battery empty";
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
    }

    public void drive() {
        if(drivenMetre < 2000){
            drivenMetre += 20;
            batteryPercent -= 1;
        }
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }
}
