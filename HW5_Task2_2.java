import javax.xml.transform.Source;

public class HW5_Task2_2 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}