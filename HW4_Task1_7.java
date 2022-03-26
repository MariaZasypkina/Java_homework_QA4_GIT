public class HW4_Task1_7 {
    /**
     * Задача №7
     *
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести количество элементов в массиве.
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i].length;
        }
    System.out.println(count);
    }
}
