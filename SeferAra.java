package views;

public class SeferAra implements arayuz.ISeferBul{
    private String baslangicYeri;
    private String varisYeri;
    private String tarih;

    public SeferAra(String baslangicYeri,String varisYeri,String tarih){
        this.baslangicYeri = baslangicYeri;
        this.varisYeri = varisYeri;
        this.tarih = tarih;
    }

    public void setBaslangicYeri(String baslangicYeri) {
        this.baslangicYeri = baslangicYeri;
    }

    public String getBaslangicYeri() {
        return baslangicYeri;
    }

    public void setTarih(String  tarih) {
        this.tarih = tarih;
    }

    public String getTarih() {
        return tarih;
    }

    public void setVarisYeri(String varisYeri) {
        this.varisYeri = varisYeri;
    }

    public String getVarisYeri() {
        return varisYeri;
    }

    @Override
    public void SeferBul() {
        System.out.println("\n-----Sefer Ara-----\n");
        System.out.println(getBaslangicYeri() + " dan " + getVarisYeri() + "'a \nPamukkale Turizm\nMetro Turizm\nIstanbul Konfor\nSakarya Vib");
    }
    @Override
    public void SeferBul(String tarih) {
        System.out.println(getTarih() + " bu tarihte araçlarımız kalkış yapacaktır Bilginize)");
    }
}