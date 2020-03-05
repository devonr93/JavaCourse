public class Main {

    public static void main(String[] args) {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Mi/h = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(50000);

        BarkingDog.shouldWakeUp(true, 7);
    }
}
