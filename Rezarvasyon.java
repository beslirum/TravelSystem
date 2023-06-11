package views;

public class Rezarvasyon implements arayuz.IKayit {
    private int rezarvasyonNo;
    private String seyahetDetayi;
    private String rezarvasyonDurum;
    public Rezarvasyon(){}
    public Rezarvasyon(int rezarvasyonNo,String seyahetDetayi,String rezarvasyonDurum){
        this.rezarvasyonNo = rezarvasyonNo;
        this.seyahetDetayi = seyahetDetayi;
        this.rezarvasyonDurum = rezarvasyonDurum;
    }
    public void setRezarvasyonNo(int rezarvasyonNo) {
        this.rezarvasyonNo = rezarvasyonNo;
    }

    public int getRezarvasyonNo() {
        return rezarvasyonNo;
    }

    public void setSeyahetDetayi(String seyahetDetayi) {
        this.seyahetDetayi = seyahetDetayi;
    }

    public String getSeyahetDetayi() {
        return seyahetDetayi;
    }

    public void setRezarvasyonDurum(String rezarvasyonDurum) {
        this.rezarvasyonDurum = rezarvasyonDurum;
    }

    public String getRezarvasyonDurum() {
        return rezarvasyonDurum;
    }


    @Override
    public void Yazdir(int rezarvasyonNo) {
        System.out.println("\n-----Rezarvasyon----\n");
        System.out.println("Rezarvasyon Detaylari; \nRezarvasyon Numaranız; " + getRezarvasyonNo());
    }

    @Override
    public void Yazdir() {
        System.out.println("Seyahetin gerçekleşeceği " +
                "araç seçiminiz; " + getSeyahetDetayi() + "\nRezarvasyon Durumunuz; " + getRezarvasyonDurum());
    }

    public void SeyahetDetayi(){
        System.out.println("\n-----Detay-----\n");
        System.out.println("Not; İller arasında seyahat etmek isteyenler, e-devlet üzerinden "+ getRezarvasyonNo() +" numaranız ile birlikte, \nseyahat belgesi almak için talepte " +
                "bulunabilir. Başvuru, Seyahat İzin Kurulu'na iletilecek ve değerlendirmeye alınacak");
    }
}