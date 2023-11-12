public class Main {
    public static void main(String[] args) {
        System.out.println("задача № 1");
        int clientOS = 1;
        int IOS = 0;
        int Android = 1;
        if (clientOS == IOS) {
            System.out.println("Вы пользуетесь iOS. Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == Android) {
            System.out.println("Вы пользуетесь Android. Установите версию приложения для Android по ссылке:");
        }else {
            System.out.println("Ваш девайс не определяется");
        }
        System.out.println("задача № 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите современную версию приложения для Android по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && clientDeviceYear >=2015) {
            System.out.println("Установите современную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Мы не поддерживаем вашу версию приложения");
        }
        System.out.println("задача № 3");
        int year = 2018;
        if (year <1584 ) {
            System.out.println("Был введен высокосный год");
        } else if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("задача № 4");
        int deliveryDistance =95;
        int days = 1;
        if (deliveryDistance < 20 ) {
            System.out.println("Доставка в пределах 20 км занимает"+days + "день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км добавляет еще один день доставки"+(days+1)+"дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах 60 км до 100 км добавляет еще одни сутки"+(days+2)+ "дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        System.out.println("задача № 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябрь");
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");

                int monthNumber1 = 12;
                switch (monthNumber1) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("зима");
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("весна");
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("лето");
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("осень");
                        break;
                    default:
                        System.out.println("больше времен года нет");

                }

        }
    }
}