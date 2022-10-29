/**
 * @author Gokalp on 10/11/22
 */
public class MySqlCustomerDal implements CustomerDal, Repository{
    @Override
    public void add() {
        System.out.println("Veri kaydedildi: MySql");
    }
}
