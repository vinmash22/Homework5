public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
            if (proverka1 != 0 || proverka2 == 0) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - невисокосный год");
            }
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " - лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " - осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

