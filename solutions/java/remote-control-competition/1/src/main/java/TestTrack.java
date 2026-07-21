import java.util.List;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
        //throw new UnsupportedOperationException("Please implement the (static) TestTrack.race() method");
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars, Collections.reverseOrder());
        return cars;
        //throw new UnsupportedOperationException("Please implement the (static) TestTrack.getRankedCars() method");
    }
}
