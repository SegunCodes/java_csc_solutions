public class AverageCalculator {
    public static void main(String[] args) {
        double[] values = {10.5, 11.6, 12.7, 13.8};
        double sum = 0;

        // Calculate the sum of all values
        for (double value : values) {
            sum += value;
        }

        // Calculate the average
        double average = sum / values.length;

        // Print the result
        System.out.println("The average of the values is: " + average);
    }
}
