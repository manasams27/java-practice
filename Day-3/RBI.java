public class RBI {
    double rateOfInterest() {
        return 8.2;
    }
}

class ICICI extends RBI {
    @Override
    double rateOfInterest() {
        return 8.0;
    }
}

class IDBI extends RBI {
    @Override
    double rateOfInterest() {
        return 6.4;
    }
}

class Main {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        ICICI icici = new ICICI();
        IDBI idbi = new IDBI();

        System.out.println("RBI Rate: " + rbi.rateOfInterest());
        System.out.println("ICICI Rate: " + icici.rateOfInterest());
        System.out.println("IDBI Rate: " + idbi.rateOfInterest());
    }
}