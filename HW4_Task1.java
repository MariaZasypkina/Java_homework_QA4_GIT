public class HW4_Task1 {
    public static void main(String[] args) {
        /**
         Задача №1

         Дан массив:
         int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         необходимо вывести сумму всех значений массива.
         */

int [] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
int sum = 0;
int i;
for (i = 0; i < array.length; i++) sum += array[i];
        System.out.println(sum);
    }
}
