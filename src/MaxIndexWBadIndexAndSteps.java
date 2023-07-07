public class MaxIndexWBadIndexAndSteps {
    private static int maxIndex(int steps, int badIndex) {

        int currentStepTry = 0;
        int maxIndex = 0;

        while (true) {

            int j = 1;
            int currentIndex = 0;
            for (int step = 1; step <= steps; step++) {
                if (step == currentStepTry && currentStepTry != 0) {
                    j++;
                    continue;
                }

                if (currentIndex + j == badIndex) {
                    currentIndex = 0;
                    break;
                }
                currentIndex += j;
                j++;
            }
            if (maxIndex > currentIndex) {
                return maxIndex;
            }
            maxIndex = currentIndex;
            currentStepTry++;

        }

    }

    private static int maxIndexProVersion(int steps, int badIndex) {
        int i = 0;
        int j = 1;
        for (int k = 0; k < steps; k++) {
            if (i + j == badIndex) {
                i -= 1;
            }
            i += j;
            j += 1;
        }

        return i;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(maxIndex(4, 6));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
//        System.out.println(maxIndexProVersion(4, 6));
    }
}
