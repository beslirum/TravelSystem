package arayuz;

public class Rezervasyon implements arayuz.IRezervasyon {
    private int rezervasyonNo;

    private String seyehatDetayi;
    private String rezervasyonDurum;

    public Rezervasyon(int rezervasyonNo, String seyehatDetayi, String rezervasyonDurum){
        this.rezervasyonNo=rezervasyonNo;
        this.seyehatDetayi=seyehatDetayi;
        this.rezervasyonDurum=rezervasyonDurum;
    }

    public void setRezervasyonNo(int rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public int getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonDurum(String rezervasyonDurum) {
        this.rezervasyonDurum = rezervasyonDurum;
    }

    public String getRezervasyonDurum() {
        return rezervasyonDurum;
    }

    public void setSeyehatDetayi(String seyehatDetayi) {
        this.seyehatDetayi = seyehatDetayi;
    }
    public String getSeyehatDetayi(){
        return seyehatDetayi;
    }

    @Override
    public void RezervasyonYap(){
        System.out.println(getRezervasyonNo() + " numaralı rezervasyonunuz ve" + getRezervasyonDurum() + "rezervasyon durumunuzla sisteme kaydedildi.");
    }
    @Override
    public void SeyehatDetayi(){
        System.out.println("İlgili seyehatinize ait detay şu şekildedir: " +getSeyehatDetayi());
    }
}
