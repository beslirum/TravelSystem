package models;

import arayuz.IKayit;

public class Kullanici implements IKayit {

    private  String kullaniciAdi;
    private  int sifre;
    private   String email;


    public Kullanici(String kullaniciAdi,int sifre,String email){
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;

    }

    public void setKullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getKullaniciAdi(){
        return kullaniciAdi;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setSifre(int sifre){
        this.sifre = sifre;
    }
    public int getSifre(){return sifre;}

    @Override
    public void Yazdir() {
        System.out.println("\n***Merhaba " + getKullaniciAdi() + ", " + getEmail() +
                " mail adresiniz ve şifreniz kaydedilmiştir***");
    }
    @Override
    public void Yazdir(int sifre) {
        System.out.println("\nŞifreniz; " + getSifre() + ". değiştirmek istiyorsanız yeniden kayıt olmanız gerekiyor");
    }
}
