/**
 * @author Gokalp on 9/18/22
 */
public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");

        //for each
        int[] arr = {125, 132, 95, 116, 110};
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("For Each Döngüsü Bitti.");

        //while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü Bitti");


        //do-while
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
