/**
 * @author Gokalp on 10/1/22
 */
public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new TarimKrediManager());
    }
}
