public class TaskEight {

    public static void main(String[] args) {
        int[] progressionA = new int[]{11, 15, 17, 24, 30, 34};
        int[] progressionB = new int[]{12, 20, 21, 37};
        System.out.println("Прогрессия a: ");
        Helper.printArray(progressionA);
        System.out.println("Прогрессия b: ");
        Helper.printArray(progressionB);

        int[] indexesArray = new int[progressionB.length];
        fillNewProgression(progressionA, progressionB, indexesArray);
        Helper.printArray(indexesArray);
    }


    private static void fillNewProgression(int[] progressionA, int[] progressionB, int[] indexesArray) {
        int aIndex = 0, bIndex = 0;
        int newProgressionLength = progressionA.length + progressionB.length;
        boolean isExistElementA, isExistElementB;
        for (int indexNewProgression = 0; indexNewProgression < newProgressionLength; indexNewProgression++) {
            isExistElementA = progressionA.length > aIndex;
            isExistElementB = progressionB.length > bIndex;
            if (isExistElementA && progressionA[aIndex] < progressionB[bIndex]) {
                aIndex++;
            } else if (isExistElementB) {
                indexesArray[bIndex] = indexNewProgression;
                bIndex++;
            }
        }
    }
}
