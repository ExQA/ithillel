import java.util.Arrays;

public class ArrayValueCalculator {

    public static int doCalc(String[][] elements) throws ArraySizeException, ArrayDataException {
        if (elements.length != 4 ||
                Arrays.stream(elements).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Invalid array size. Expected 4x4.");
        }
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                try {
                    sum += Integer.parseInt(elements[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in the cell [" + i + "][" + j + "]", e);
                }
            }
        }
        return sum;
    }
}
