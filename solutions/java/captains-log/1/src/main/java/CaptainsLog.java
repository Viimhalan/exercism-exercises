import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
        //throw new UnsupportedOperationException("Please implement the CaptainsLog.randomPlanetClass() method");
    }

    String randomShipRegistryNumber() {
        int r = 1000 + random.nextInt(9000);
        return "NCC-" + r;
        //throw new UnsupportedOperationException("Please implement the CaptainsLog.randomShipRegistryNumber() method");
    }

    double randomStardate() {
        return 41000 + 1000 * random.nextDouble();
        //throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
