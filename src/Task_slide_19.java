/*
        Есть двухзначное число.
        Вывести сумму его цифр.
 */

public class Task_slide_19 {
    public static void main(String[] args) {
        byte num = 73;
        System.out.print("Сумма цифр числа " + num + " равна: ");
        System.out.println((num/10) + (num%10));
    }
}
