public class Main {
    public static void main(String[] args) {
        int i;
// 1-е задание блока "циклы. урок 2"
        System.out.println("задание 1");
        int cash = 0;
        i = 0;
        while (cash < 2_459_000) {
            cash = cash + 15000;
            i++;
        }
        System.out.println("Месяц - " + i + ", сумма накоплений равна " + cash + " рублей\n");

// 2-е задание блока "циклы. урок 2"
        System.out.println("задание 2");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

// 3-е задание блока "циклы. урок 2"
        System.out.println("задание 3");
        int people = 0;
        for (i = 1; i <= 10; i++) {
            people = people + (12_000_000 / 1000) * (17 - 8);  //    (12_000_000/1000)*(17-8) - годовой прирост населения
            System.out.println("Год " + i + " численность населения составляет " + (people + 12_000_000));
        }
        System.out.println();

// 4-е задание блока "циклы. урок 2"
        System.out.println("задание 4");
        float deposit = 15000f;
        i = 0;
        do {
            deposit = deposit + deposit * 0.07f;
            i++;
            System.out.println("месяц- " + i + ", сумма накоплений- " + deposit);
        } while (deposit < 12_000_000);
        System.out.println();

// 5-е задание блока "циклы. урок 2"
        System.out.println("задание 5");
        deposit = 15000f;
        i = 0;
        do {
            deposit = deposit + deposit * 0.07f;
            i++;
            if (i % 6 == 0) {
                System.out.println("месяц- " + i + ", сумма накоплений- " + deposit);
            }
        } while (deposit < 12_000_000);
        System.out.println();

// 6-е задание блока "циклы. урок 2"
        System.out.println("задание 6");
        deposit = 15000f;
        i = 0;
        while (i <= 108) {
            deposit = deposit + deposit * 0.07f;
            i++;
            if (i % 6 == 0) System.out.println("месяц- " + i + ", сумма накоплений- " + deposit);
        }
        System.out.println();

// 7-е задание блока "циклы. урок 2"
        System.out.println("задание 7");
        int friday = 4;
        for (i = 1; i <= 31; i++){
            if (i == friday || ((i-friday)%7) == 0) System.out.println("сегодня "+i+" число(пятница) Необходимо подготовить отчет");
        }
        System.out.println();

// 8-е задание блока "циклы. урок 2"
        System.out.println("задание 8");
        for (i = 0; i <=2125; i++)
            if (i > 1825 && (i%79) == 0){
                System.out.println(i);
            }


// task 9
    }
}