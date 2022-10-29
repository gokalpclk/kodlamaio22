package core.logging;

/**
 * @author Gokalp on 10/7/22
 */
public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println(data + " logged on Mail");
    }
}
