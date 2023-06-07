package arayüz;

public class Odeme implements IOdeme{
    private boolean odemeTuru;
    private int kacGun;

    public void setKacGun(int kacGun) {
        this.kacGun = kacGun;
    }

    public int getKacGun() {
        return kacGun;
    }

    public void setOdemeTuru(boolean odemeTuru) {
        this.odemeTuru = odemeTuru;
    }

    public boolean getOdemeTuru(){
        return  odemeTuru;
    }
    public Odeme(boolean odemeTuru,int kacGun){
        this.odemeTuru=odemeTuru;
        this.kacGun=kacGun;
    }
    @Override
    public float FiyatHesapla() {
        float ucret;
        if(getOdemeTuru() == true)
            ucret = kacGun * 25;
        else
            ucret = kacGun * 25 + 30;
        return ucret;
    }
    public void OdemeBilgisi() {
        if(getOdemeTuru()==true) {
            System.out.println(getKacGun() + " gunluk kalacağınız tatil için toplam ödeyeceğiniz nakit fiyat; " + FiyatHesapla() + "$");
        }else{
            System.out.println(getKacGun() + " gunluk kalacağınız tatil için toplam ödeyeceğiniz kredi kart fiyat; " + FiyatHesapla() + "$");
        }
    }

}
