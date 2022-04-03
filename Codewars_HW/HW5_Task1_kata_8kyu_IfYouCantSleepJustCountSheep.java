package Codewars_HW;

public class HW5_Task1_kata_8kyu_IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }

}
