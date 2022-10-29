/**
 * @author Gokalp on 9/24/22
 */
public class Main {
    public static void main(String[] args) {

        String message = "The weather is vey nice today.";
        message.substring(0, 2);
        String city = getCity();
        System.out.println(city);
        int number = addition(15, 7);
        System.out.println(number);
        int sum = addition2(2, 3, 4, 5, 6, 7);
        System.out.println(sum);

    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int addition2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static String getCity() {
        return "ankara";
    }
}
