/****************************************************CODE EXERCISE 1: SPEED CONVERTER *****************************************************************
Description Exercise:
First method:     Write a method called toMilesPerHur that has 1 parameter of type double with the name kiloMetersPerHour. 
                  This method needs to return value of the calculation type long.
                  If the parameter of the killometerPerHour is less than 0, the method  toMilesPerHours needs to return  -1 to indicatean invalid value. 
                  Otherwise, ifbit is positive, calculate the value of miles per hour, round it and return it. 
Second method:    Write another  method called printConversion with 1 parameter of type double with the name kilometersPerHour. 
                  This method should not return anything(void) and it needs  to calculate milesPerHour from the killometersPerHour parameter. Then it 
                  needs to print a message in the format "XX km/h = YY mi/h".
                  XX represents the original value kilometersPerHour
                  YY represents the rounded milesPerHour from the kilometersPerHour parameter.
                  If the parameter kilometersPerHour is < 0 then the text "Invalid Value".
                  Use method Math.round to round the number of calculated miles per hour (double). The method should return long. 
                  NO ADDED MAIN METHOD IN THIS CODE.
                  All methods should be defined as public static
                  1 mile per hous is 1.609 kilometers per hour
                  
*****************************************************CODE*********************************************************************************************/

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
