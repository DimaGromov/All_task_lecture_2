/*
        Объявите переменные и присвойте им значения каждого типа.
        А теперь поменяйте их значения с помощью составных операторов присваивания.
        А теперь присвойте переменной результат арифметической операции.
 */

public class Task_slide_17 {
    public static void main(String[] args) {

        boolean b = true;
        byte bt = 100;
        char ch = 'a';
        double d = 5.0;
        float f = 3.32f;
        int i = 123456;
        long l = 987654321L;
        short s = -15256;

        bt -= 50;
        ch += 1;
        d /= 2;
        f *= 2;
        i *= 50;
        l /= 1000;
        s += 15256;

        bt = (byte) 100 - 50;
        ch = 'a' + 'b';
        d = 5.0 * 12.5;
        f = 3.32F + 15.7F;
        i = 123456 / 123456;
        l = 987654321L - 123456789L;
        s = (short) 15256 + 5462;

    }
}
