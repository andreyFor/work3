public class Work3 {
    public static void main(String[] args) {
        System.out.println("new world");



        // Задание номер 1

        int clientOSIos = 0;
        if (clientOSIos == 0) {
            System.out.println("Установите версию приложения для IOS по сылке");
        } else {
            System.out.println("Установите версию приложения для Android по сылке");


        }

        // Задание номер 2


        int clientDeviceYear = 2011;
        if (clientDeviceYear >= 2015 && clientOSIos == 0) {
            System.out.println("Установить обычную версию приложения для IOS по сылке");

        } else if (clientDeviceYear < 2015 && clientOSIos == 0) {
            System.out.println("Установить облегченную версию приложения для IOS по сылке");

        } else if (clientDeviceYear >= 2015 && clientOSIos == 1) {
            System.out.println("Установить обычную версию приложения для Android по сылке");

        } else if (clientDeviceYear < 2015 && clientOSIos == 1) {
            System.out.println("Установить облегченную версию приложения для Android по сылке");
        }


        // Задание номер 3

        int year = 2022;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0));
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        // Задание номер 4


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется 1 день");
        } else if (deliveryDistance <= 60){
            System.out.println("Доставка будет занимать 2 дня");
        } else if (deliveryDistance < 100){
            System.out.println("Доставка будет занимать 3 дня");
        } else {
            System.out.println("Извините доставки в ваш район пока нет!");
        }



        // Задание номер 5

        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("сейчас лето");
            case 9:
            case 10:
            case 11:
                System.out.println("сейчас осень");
                break;
        }











    }
}
