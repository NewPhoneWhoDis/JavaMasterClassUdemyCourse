package exercise19;

public class LastDigitChecker {

    public static boolean isValid(int num){
        return (num > 9) && (num < 1001);
    }

    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            x %= 10;
            y %= 10;
            z %= 10;
            return (x == y) || (x == z) || (y == z);
        }
        return false;
    }
}
