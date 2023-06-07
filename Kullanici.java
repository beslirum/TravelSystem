package arayüz;

public class Kullanici implements IKullanici{

    private  String kullaniciAdi;
    private  int sifre;
    private   String email;


    public Kullanici(String kullaniciAdi,int sifre,String email){
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;

    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    public int getSifre() {
        return sifre;
    }

    @Override
    public void KullaniciGirisi() {
        System.out.println("Merhaba " + getKullaniciAdi() + ", " + getEmail() + " mail adresiniz ve şifreniz kaydedilmiştir");
    }
}
