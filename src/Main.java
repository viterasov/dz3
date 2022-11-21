public class Main {
    public static void main(String[] args) {

        // задание №1

        int clientOS = 0;
        int Android = 1;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        }

        if (Android == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }

        // задание №2

        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }

        // задание №3

        int year = 2000;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("год является високосным».");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным».");
        } else {
            System.out.println("год не является високосным».");
        }

        // задание №4


        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance < 21) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance > 20 && deliveryDistance < 61) {
            System.out.println("Потребуется двое суток");
        } else {
            System.out.println("Потребуется трое суток");

        }

        // задание №5

        int monthNumber = 6;
        switch (monthNumber) {
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("зима");
                break;
            case 3:
                System.out.println("весна");
                break;
            case 4:
                System.out.println("весна");
                break;
            case 5:
                System.out.println("весна");
                break;
            case 6:
                System.out.println("лето");
                break;
            case 7:
                System.out.println("лето");
                break;
            case 8:
                System.out.println("лето");
                break;
            case 9:
                System.out.println("осень");
                break;
            case 10:
                System.out.println("осень");
                break;
            case 11:
                System.out.println("осень");
                break;
            case 12:
                System.out.println("зима");
                break;
            default:
                System.out.println("такого месяца не существует");
        }
    }
}
