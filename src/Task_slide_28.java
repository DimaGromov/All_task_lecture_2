/*
        Есть три числа.
        Вывести true, если они все разные.
 */

public class Task_slide_28 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = 33;

        if ((a != b) && (a != c) && (b != c)) {
            System.out.println(true);
        }
    }
}

