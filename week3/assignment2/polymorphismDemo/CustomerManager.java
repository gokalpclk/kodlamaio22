/**
 * @author Gokalp on 10/9/22
 */
public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Musteri eklendi");
        baseLogger.log("log mesaji");

    }
}
