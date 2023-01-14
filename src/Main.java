public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int year = 2015;
        char clientOS = 0;
        if (year < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2000;
        int proverka = year % 4;
        int proverka1 = year % 100;
        int proverka2 = year % 400;
        if (proverka == 0) {
            if (proverka1 !=0 || proverka2 == 0) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - невисокосный год");
            }
        }
        else {
            System.out.println(year + " - невисокосный год");
        }
    }
}

