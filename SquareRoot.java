public class SquareRoot {
    public static void main(String[] args) {
        int number = 10;
        double low = 0, high = number, mid = 0;

        // Precision for floating result
        double epsilon=0.00001;

        while ((high - low) > epsilon) {
            mid = (low + high) / 2;
            if (mid * mid > number)
                high = mid;
            else
                low = mid;
        }

        System.out.println("Square root of " + number + " is " + (int)mid);
    }
} 

op:
Square root of 8 is 2  

    1.actual value is 2.82842 it gives int of this value to truncate the decimal.

op:
4
Square root of 16 is 4 
