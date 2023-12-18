public class Main {
    public static void main(String[] args) {

        /*
        Задача 1
С помощью цикла for выведите в консоль все числа от 1 до 10.
Критерии оценки
 Использовали цикл for.
 Все значения от 1 до 10 вывели в консоль.
 Переменная в цикле носит простое значение, например буквенное i.
         */
        System.out.println("Задача № 1");

        for (int i = 1; i <= 10; i++)
            System.out.println(i);
         /*
        Задача 2
С помощью цикла for выведите в консоль все числа от 10 до 1.
         */
        System.out.println("Задача № 2");
        for (int i = 10; i >= 1; i--)
            System.out.println(i);
         /*
        Задача 3
Выведите в консоль все четные числа от 0 до 17.
         */
        System.out.println("Задача № 3");
        for (int i = 0; i <= 17; i = i + 2)
            System.out.println(i);


    }

}