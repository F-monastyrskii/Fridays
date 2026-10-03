//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1 задание -  скрипт, который будет определять все пятницы в месяце и выводить напоминание о сдаче еженедельного отчета.");
        int firstFriday = 1;
        int day = 1;
        for (; day <= 31; day++) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("2 задание - программа для отслеживания дистанции на марафоне (42 195 м)");
        //1st version
        int totalDistance = 42195;
        int coveredDistance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (totalDistance - coveredDistance) + " метров");
            coveredDistance = coveredDistance + 500;
        } while (coveredDistance < totalDistance);
        //2nd version
        for (coveredDistance = 0; coveredDistance < totalDistance; coveredDistance = coveredDistance + 500){
            System.out.println("Держитесь! Осталось " + (totalDistance - coveredDistance) + " метров");
        }
        System.out.println("3 задание -  ПО для городской инфраструктуры");

        //1st version while
        int budget = 1000;
        int currentDay = 1;
        int money = budget;

        while (money > 0) {
            if (currentDay % 5 == 0){
                currentDay++;
                continue;
            }
            if (money<100){
                break;
            }
            money = money - 100;
            currentDay++;
        }
        System.out.println("(while) Парковки хватит на " + (currentDay - 1) + "дней");
        // 2nd version for
        money = budget;
        int totalDays = 0;

        for (int d = 1; ; d++) {
            if (d % 5 == 0) {
                totalDays++;
                continue;
            }
            if (money < 100) {
                break;
            }
            money -= 100;
            totalDays++;
        }
        System.out.println("(for) парковки хватит на " + totalDays + " дней");
        System.out.println("4 задание -  автоматизировать расчет накоплений и вывести в консоль данные по каждому месяцу.");
        int month = 0;
        int total = 0;

        while (true){
            month++;
            total += 15_000;

            if (month % 6 == 0){
                total += (total * 0.07);
            }
            System.out.println("месяц "+month+"-ый. Накоплено : "+total);
            if (total >= 12_000_000) {
                break;
            }
        }System.out.println("для накопления 12 000 000 потребовалось "+ month + " месяцев");
        System.out.println("5 задание -   умная зарядка, которая экономит ресурс аккумулятора и предотвращает сильный перегрев");
        int charge = 20;
        int minute=0;
        int overheats=0;

        while (charge < 100& overheats<=3) {
            minute ++;
            if (minute % 10 == 0 ){
                overheats ++;
                System.out.println("перегрев");

                if (overheats == 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute++;
                continue;
            }
            charge+=2;
            }
        if (charge>=100) {
            System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}


