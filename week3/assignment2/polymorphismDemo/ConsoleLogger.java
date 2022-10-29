/**
 * @author Gokalp on 10/9/22
 */
public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to console : log mesaji");
    }
}
