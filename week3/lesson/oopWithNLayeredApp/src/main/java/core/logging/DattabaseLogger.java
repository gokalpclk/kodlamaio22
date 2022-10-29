package core.logging;

/**
 * @author Gokalp on 10/7/22
 */
public class DattabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println(data + " Logged on Database");
    }
}
