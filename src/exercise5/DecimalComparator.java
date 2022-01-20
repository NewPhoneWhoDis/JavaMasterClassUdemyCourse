package exercise5;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
        // moving first 3 decimal places to the right by multiplying
        int myFirstCheck = (int)(myFirstDouble * 1000);
        int mySecondCheck = (int)(mySecondDouble * 1000);
        if(myFirstCheck - mySecondCheck == 0){
            // means they are equal
            return true;
        } else
            return false;
    }
}
