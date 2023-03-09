public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
                 }
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i = i-1) {
            System.out.println("Цикл " + i);
        }
        System.out.println();

    }
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Чётные числа " + i);
        }
    }
        }