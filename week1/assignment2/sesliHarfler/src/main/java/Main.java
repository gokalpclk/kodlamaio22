/**
 * @author Gokalp on 9/18/22
 */
public class Main {
    public static void main(String[] args) {

        char harf = 'E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }
}
