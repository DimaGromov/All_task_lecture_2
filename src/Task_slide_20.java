/*
        Есть число.
        Оно равно вашему возрасту.
        Вывести сколько дней Вы прожили.
 */

public class Task_slide_20 {
    public static void main(String[] args) {
        short age = 25;                         // Возраст человека
        short days_in_year = 365;               // Количество дней в году (без учёта високостного года)
        int days_on_earth = age * days_in_year; // Количество дней, прожитых на земле

        System.out.println("Челокек, которому " + age + " лет, прожил на земле " + days_on_earth + " дней.");
    }
}
