/**
 * @author Gokalp on 9/23/22
 */
public class Main {
    public static void main(String[] args) {
        searchNumber();
    }

    public static void searchNumber(){

        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};

        int search = 6;
        boolean hasSearch = false;

        for (int number : numbers) {
            if (number == search) {
                hasSearch = true;
                break;
            }
        }

        if (hasSearch) {
            sendMessage("Numbers has " + search);
        } else {
            sendMessage("Numbers hasn't " + search);
        }
    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}
