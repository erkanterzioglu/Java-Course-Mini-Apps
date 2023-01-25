public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Sona Erdi");
        //While
        int i = 0;
        while (i < 10) {
            i += 2;
            System.out.println(i);
        }
        //infinite loop
        System.out.println("While döngüsü sona erdi");
        //Do-While

        do {
            System.out.println(i);
            i += 2;

        } while (i < 10);
    }

}