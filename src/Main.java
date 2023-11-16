public class Main {
    public static void main(String[] args) {
        String[][] exampleArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayValueCalculator.doCalc(exampleArray);
            System.out.println("Calculate result: " + result);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Reason: " + e.getCause().getMessage());
            }
        }
    }
}