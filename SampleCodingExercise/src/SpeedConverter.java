public class SpeedConverter {

    public static void main(String[] args) {
        long miles = toMilesPerHour(1.5d);
        System.out.println(miles);
        miles = toMilesPerHour(10.25d);
        System.out.println(miles);
        miles = toMilesPerHour(-5.6d);
        System.out.println(miles);
        miles = toMilesPerHour(25.42d);
        System.out.println(miles);
        miles = toMilesPerHour(75.114d);
        System.out.println(miles);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0d) {
            return -1;
        }
        return (long) Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Valid");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
