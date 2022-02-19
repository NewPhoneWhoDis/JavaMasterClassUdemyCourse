package exercise20;

public class GreatestCommonDivisor {

    /*
    Solution using the Euclid's algorithm.
    Subtracting larger number by smaller(each time replacing larger number with the subtraction result)
    until getting two equal numbers which will be the greatest common divisor.
     */

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
}
