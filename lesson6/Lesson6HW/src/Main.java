public class Main {

    public static void main(String[] args) {
        int[] arr1d = {1, 2, 3, 4, 5};
        int[][] arr2d = {{1, 2}, {3, 4}, {5, 6}};

        // One-dimensional array stats
        int sum1d = 0;
        int countOdd1d = 0;
        int countEven1d = 0;

        for (int i = 0; i < arr1d.length; i++) {
            sum1d += arr1d[i];
            if (arr1d[i] % 2 == 0) {
                countEven1d++;
            } else {
                countOdd1d++;
            }
        }

        double avg1d = (double) sum1d / arr1d.length;

        System.out.println("One-dimensional array stats:");
        System.out.println("Sum: " + sum1d);
        System.out.println("Average: " + avg1d);
        System.out.println("Number of odd numbers: " + countOdd1d);
        System.out.println("Number of even numbers: " + countEven1d);

        // Two-dimensional array stats
        int sum2d = 0;
        int countOdd2d = 0;
        int countEven2d = 0;
        int totalElements = 0;

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                sum2d += arr2d[i][j];
                if (arr2d[i][j] % 2 == 0) {
                    countEven2d++;
                } else {
                    countOdd2d++;
                }
                totalElements++;
            }
        }

        double avg2d = (double) sum2d / totalElements;

        System.out.println("Two-dimensional array stats:");
        System.out.println("Sum: " + sum2d);
        System.out.println("Average: " + avg2d);
        System.out.println("Number of odd numbers: " + countOdd2d);
        System.out.println("Number of even numbers: " + countEven2d);
    }
}