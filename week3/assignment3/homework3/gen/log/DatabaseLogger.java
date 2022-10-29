package gen.log;

/**
 * @author Gokalp on 10/11/22
 */
public class DatabaseLogger implements Logger{
    @Override
    public void log(String log) {
        System.out.println("Logged on Database");
    }
}
