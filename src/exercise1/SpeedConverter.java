package exercise1;

public class SpeedConverter {
    // NOTE: AlL Methods should be defined as public static
    // NOTE: 1 mile per hour is 1.6009 kilometers per hour
    // NOTE: Do not add a main method to the solution code

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        }
        //long conversion = kilometersPerHour * 0.62;
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long conversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h");
        }
    }
}
