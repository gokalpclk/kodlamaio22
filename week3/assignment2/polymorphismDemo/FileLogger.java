/**
 * @author Gokalp on 10/9/22
 */
public class FileLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to file:" + message);
    }
}
