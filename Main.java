
import models.Kullanici;
import views.Rezarvasyon;
import views.SeferAra;
import controllers.Odeme;




public class Main {
    public static void main(String[] args) {

        //Kullanıcı
        arayuz.IKayit kArayuz = new Kullanici("Muhsina", 1234, "muhsina@gmail.com");
        kArayuz.Yazdir();
        kArayuz.Yazdir(1234);


        //SeyahetAra
        arayuz.ISeferBul sefer = new SeferAra("Istanbul","Ankara","12.06.2023");
        sefer.SeferBul();
        sefer.SeferBul("12.06.2023");


        //Rezarvasyon
        arayuz.IKayit rArayuz = new Rezarvasyon(30121090,"Metro Turizm","Onaylandı");
        rArayuz.Yazdir(30121090);
        rArayuz.Yazdir();
        Rezarvasyon r = new Rezarvasyon();
        r.setRezarvasyonNo(30121090);
        r.setSeyahetDetayi("Metro Turizm");
        r.setRezarvasyonDurum("Onaylandı");
        r.SeyahetDetayi();

        //Odeme
        arayuz.IOdeme odeme = new Odeme(true,5);
        odeme.OdemeBilgisi();

    }
}
