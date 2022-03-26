public class HW4_Task1_6 {
    /**
     * Задача №6
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести максимальное значение массива.
      */

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
             if (array[i][j] > max) max = array[i][j];
            }
        }
        System.out.println(max);
    }
}