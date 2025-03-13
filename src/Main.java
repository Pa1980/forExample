public class Main {
    public static void main(String[] args) {
// task 1
        System.out.println("task 1");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
// task 2
        System.out.println("task 2");
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
// task 3
        System.out.println("task 3");
        for (byte i = 0; i < 17; i = (byte) (i + 2)) {
            System.out.println(i);
        }
        System.out.println();
// task 4
        System.out.println("task 4");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
// task 5
        System.out.println("task 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if ((i % 100) != 0) { // проверка - не является ли год 100-ым
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println();
// task 6
        System.out.println("task 6");
        for (int i = 1; i <= 14; i++) {
            System.out.println(i * 7);
        }
        System.out.println();
// task 7
        System.out.println("task 7");
        for (int i = 1; i <= 512; ) {
            System.out.println(i);
            i = i * 2;
        }
        System.out.println();
// task 8
        System.out.println("task 8");
        int cash = 0;
        for (int i = 1; i <= 12; i++) {
            cash = cash + 29000;
            System.out.println("месяц " + i + ", сумма накоплений равна " + cash + " рублей");
        }
        System.out.println();
// task 9
        System.out.println("task 9");
        float deposit = 0.0f;
        for (int i = 1; i <= 12; i++) {
            deposit = deposit + (deposit * 0.01f) + 29000f;// (deposit * 0.01f) - 1% от суммы вклада. 29000 - зарплата на каждый месяц
            System.out.println("месяц " + i + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();
// task 10
        System.out.println("task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}