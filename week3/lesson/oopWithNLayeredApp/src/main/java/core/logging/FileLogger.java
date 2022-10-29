package core.logging;

/**
 * @author Gokalp on 10/7/22
 */
public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println(data+" logged on File");
    }
}
