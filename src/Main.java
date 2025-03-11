public class Main {
    public static void main(String[] args) {
// task 1
        System.out.println("task 1");
        for (byte i = 1; i <= 10; i++){
            System.out.println(i);}
        System.out.println();
// task 2
        System.out.println("task 2");
        for (byte i = 10; i >=1; i--){
            System.out.println(i); }
        System.out.println();
// task 3
        System.out.println("task 3");
        for (byte i = 0; i < 17; i =(byte) (i + 2)){
            System.out.println(i); }
        System.out.println();
// task 4
        System.out.println("task 4");
        for (byte i = 10; i >= -10; i--){
            System.out.println(i); }
        System.out.println();
// task 5
        System.out.println("task 5");
        for (int i = 1904; i <= 2096; i = i+4) {
            if ( (i%100) != 0) {
                System.out.println(i + " год является високосным");
            }
        }

    }
}