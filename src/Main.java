public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        {

        }
        System.out.println("Задача 2.1");
        int distance = 0;
        do {
            distance += 500;
            int remaining = 42195 - distance;
            if (remaining >= 0) {
                System.out.println("Держитесь! Осталось " + remaining + " метров");
            }
        } while (distance < 42195);
        {

        }
        System.out.println("Задача 2.2");
        for (int remaining = 42195 - 500; remaining > 0; remaining -= 500) {
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }
        {

        }
        System.out.println("Задача 3.1");
        int budget = 1000;
        int day = 1;
        int daysCount = 0;
        while (budget >= 0) {
            if (day % 5 == 0) {
                System.out.println("День " + day + ": бесплатный день!");
                daysCount++;
                day++;
                continue;
            }
            if (budget >= 100) {
                budget -= 100;
                System.out.println("День " + day + ": списано 100 рублей. Осталось: " + budget + " руб.");
                daysCount++;
                day++;
            } else {
                break;
            }
        }
        System.out.println("На бюджет хватит на " + daysCount + " дней");
        {

        }
        System.out.println("Задача 3.2");
        budget = 1000;
        daysCount = 0;
        for (int currentDay = 1; budget >= 0; currentDay++) {
            if (currentDay % 5 == 0) {
                System.out.println("День " + currentDay + ": бесплатный день!");
                daysCount++;
                continue;
            }
            if (budget >= 100) {
                budget -= 100;
                System.out.println("День " + currentDay + ": списано 100 рублей. Осталось: " + budget + " руб.");
                daysCount++;
            } else {
                break;
            }
        }

        System.out.println("На бюджет хватит на " + daysCount + " дней");
        {

        }
        System.out.println("Задача 4");
        int month = 0;
        double total = 0;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (long) total + " рублей");
            if (total >= 12000000) {
                System.out.println("Сумма превышает 12 000 000");
                break;
            }
        }
        {

        }
        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев на минуте " + minute);
                if (overheats > 3) {
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
        }
        if (overheats > 3) {
            System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
        } else {
            System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}