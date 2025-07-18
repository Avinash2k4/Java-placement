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
