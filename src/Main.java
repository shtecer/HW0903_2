public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такого быть не может");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else  {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            }

        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " год является високосным");
                    } else System.out.println(year + " год не является високосным");
                } else System.out.println(year + " год является високосным");
            }
            else System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка сутки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка 2 суток");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка 3 суток");
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
            default:
                System.out.println("Такого месяца не бывает");
        }
    }
}