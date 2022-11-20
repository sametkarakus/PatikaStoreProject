import lombok.Data;

@Data
public abstract class Product {
    public int hafiza;
    public double ekranBoyutu;
    public double pilGucu;
    public int ram;
    public String renk;
    public int depolama;
    private int id;
    private double birimFiyati;
    private double indirimOrani;
    private int stokMiktari;
    private String urunAdý;
    private Brand brand;

    public Product(int id, double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi, Brand brand) {
        this.id = id;
        this.birimFiyati = birimFiyati;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdý = urunAdi;
        this.brand = brand;

    }}

