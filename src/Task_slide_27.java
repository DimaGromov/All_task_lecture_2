/*
        Есть три числа a, b, c.
        Вывести true, если a<b<c, иначе false.
 */

public class Task_slide_27 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if ((a < b) && (b < c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
