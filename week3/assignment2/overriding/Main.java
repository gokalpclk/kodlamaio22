/**
 * @author Gokalp on 10/9/22
 */public class Main {
    public static void main(String[] args) {
       BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new OgretmenKrediManager(), new OgrenciKrediManager()};
        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}
