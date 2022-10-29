/**
 * @author Gokalp on 10/9/22
 */
public class DatabaseLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to database:" + message);
    }
}
