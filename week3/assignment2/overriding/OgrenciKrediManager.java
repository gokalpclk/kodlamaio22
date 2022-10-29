/**
 * @author Gokalp on 10/9/22
 */
public class OgrenciKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(double tutar) {
        return tutar*1.10;
    }
}
