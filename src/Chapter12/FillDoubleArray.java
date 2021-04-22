package Chapter12;

public class FillDoubleArray implements FillDoubleArrayWithNumbers {
    @Override
    public int[][] fillDoubleArray(int[][] ar, int min, int max) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = min + (int) ((max - min + 1) * Math.random());
            }
        }
        return ar;
    }

    @Override
    public int getSumFromColumn(int[][] ar, int column) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            result += ar[i][column];
        }
        return result;
    }
}
